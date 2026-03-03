class Product{
    private String productName;
    private int productId;
    private double price;
    private int quantity;

    Product(String productName,int productId,double price,int quantity){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }
    Product(String productName,int productId,double price){
        this(productName,productId,price,0);
    }
    Product(){
       this("Unknown",0,0,0);
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
    public int getQuantity(){
        return quantity;
    }
    public double calculateValue(){
        return price*quantity;
    }
    public void addStock(int amount){
        if(amount <= 0){
            System.out.println("Invalid Stock");
        }
        else{
            quantity += amount;
        }
    }
    public void sellProduct(int amount){
        if(amount <= 0){
            System.out.println("Invalid Sale");
        }
        else if(amount > quantity){
            System.out.println("Not Enough Stock");
        }
        else{
            quantity -= amount;
        }
    }
    void display(){
        System.out.println(productName + " " + productId + " " + price + " " + quantity + " " + calculateValue());
    }
}

public class ProductManagement {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("ABC", 2, 5000);
        Product p3 = new Product("BCA", 213, 50000, 0);

        p1.display();;
        System.out.println();
        p2.display();
        p2.addStock(10);
        p2.display();
        System.out.println();
        p3.display();
        p3.addStock(50);
        p3.display();
        p3.sellProduct(30);
        p3.display();
    }
}
