abstract class Product{
    protected String productName;
    protected double price;
    static String storeName = "SAH'S Store";

    Product(String productName,double price){
        this.productName = productName;
        this.price = price;
    }
    Product(String productName){
        this(productName,100);
    }
    Product(){
        this("Unknown",0);
    }

    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setPrice(double price){
        if(price<0){
            System.out.println("Invalid Price");
        }
        else{
            this.price = price;
        }
    }
    abstract double calculateFinalPrice();
    
    public void display(){
        System.out.println("Product Name : " +productName);
        System.out.println("Base Price : " +price);
        System.out.println("Store Name : " +storeName);
    }
}
class Electronics extends Product{
    double warrantyCost;
    Electronics(String productName,double price,double warrantyCost){
        super(productName,price);
        this.warrantyCost = warrantyCost;
    }
    Electronics(String productName,double warrantyCost){
        super(productName,100);
        this.warrantyCost = warrantyCost;
    }
    Electronics(){
        super();
    }
    public void addWarrantyCost(double amount){
        if(amount < 0){
            System.out.println("Invalid Warranty Cost");
        }
        else{
            warrantyCost += amount;
        }
    }
    public double calculateFinalPrice(){
        return price+warrantyCost;
    }
    public void display(){
        super.display();
        System.out.println("Warranty Cost : " +warrantyCost);
        System.out.println("Final Price : " +calculateFinalPrice());
    }
}
class Clothing extends Product{
    double discount;
    Clothing(String productName,double price,double discount){
        super(productName,price);
        this.discount = discount;
    }
    Clothing(String productName,double discount){
        super(productName,100);
        this.discount = discount;
    }
    Clothing(){
        super();
    }
    public void addDiscount(double amount){
        if((discount+amount)>price){
            System.out.println("Discount Cannot Be Greater Than Base Price");
        }
        else{
            discount += amount;
        }
    }
    public double calculateFinalPrice(){
        return price-discount;
    }
    public void display(){
        super.display();
        System.out.println("Discount : " +discount);
        System.out.println("Final Price : " +calculateFinalPrice());
    }
}


public class ProductSystem {
    public static void main(String[] args){
        Product.storeName = "Amazon";
        Product[] products = new Product[2];
        products[0] = new Electronics("Laptop",50000,0);
        products[1] = new Clothing("Jacket",5000,0);

        for(int i=0;i<products.length;i++){
            if(products[i] instanceof Electronics){
                ((Electronics)products[i]).addWarrantyCost(2000);
            }
            if(products[i] instanceof Clothing){
                ((Clothing)products[i]).addDiscount(300);
            }
            products[i].display();
            System.out.println();
        }
    }
}
