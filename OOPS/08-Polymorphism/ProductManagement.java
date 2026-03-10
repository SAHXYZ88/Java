class Product{
    protected String productName;
    protected int productId;
    protected double price;
    static String storeName = "SAH'S Store";

    Product(String productName,int productId,double price){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }
    Product(String productName,int productId){
        this(productName,productId,100);
    }
    Product(){
        this("Unknown",0,0);
    }

    public String getProductName(){
        return productName;
    }
    public int getProductId(){
        return productId;
    }
    public double getPrice(){
        return price;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public void setPrice(double price){
        if(price<0){
            System.out.println("Invalid Price");
        }
        else{
            this.price = price;
        }
    }
    public double calculateFinalPrice(){
        return price;
    }
    public void display(){
        System.out.println("Product Name : " +productName);
        System.out.println("Product Id : " +productId);
        System.out.println("Base Price : " +price);
        System.out.println("Store Name : " +storeName);
    }
}
class Electronics extends Product{
    double warrantyCost;
    Electronics(String productName,int productId,double price,double warrantyCost){
        super(productName,productId,price);
        this.warrantyCost = warrantyCost;
    }
    Electronics(String productName,int productId,double warrantyCost){
        super(productName,productId,100);
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
    Clothing(String productName,int productId,double price,double discount){
        super(productName,productId,price);
        this.discount = discount;
    }
    Clothing(String productName,int productId,double discount){
        super(productName,productId,100);
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
class Grocery extends Product{
    double deliveryCharge;
    Grocery(String productName,int productId,double price,double deliveryCharge){
        super(productName,productId,price);
        this.deliveryCharge = deliveryCharge;
    }
    Grocery(String productName,int productId,double deliveryCharge){
        super(productName,productId,100);
        this.deliveryCharge = deliveryCharge;
    }
    Grocery(){
        super();
    }
    public void addDeliveryCharge(double amount){
        if(amount >= 0){
            deliveryCharge += amount;
        }
        else{
            System.out.println("Invalid Delivery Charge Amount");
        }
    }
    public double calculateFinalPrice(){
        return price+deliveryCharge;
    }
    public void display(){
        super.display();
        System.out.println("Delivery Charge : " +deliveryCharge);
        System.out.println("Final Price : " +calculateFinalPrice());
    }
}


public class ProductSystem {
    public static void main(String[] args){
        Product.storeName = "Amazon";
        Product[] products = new Product[3];
        products[0] = new Electronics("Laptop",101,50000,0);
        products[1] = new Clothing("Jacket",102,5000,0);
        products[2] = new Grocery("Rice",103,800,0);

        for(int i=0;i<products.length;i++){
            if(products[i] instanceof Electronics){
                ((Electronics)products[i]).addWarrantyCost(2000);
            }
            if(products[i] instanceof Clothing){
                ((Clothing)products[i]).addDiscount(300);
            }
            if(products[i] instanceof Grocery){
                ((Grocery)products[i]).addDeliveryCharge(50);
            }
            products[i].display();
            System.out.println();
        }
    }
}
