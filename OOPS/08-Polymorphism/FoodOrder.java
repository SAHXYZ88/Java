class Order{
    protected String orderId;
    protected double foodPrice;
    static String restaurantName = "Food Hub";

    Order(String orderId,double foodPrice){
        this.orderId = orderId;
        this.foodPrice = foodPrice;
    }
    Order(String orderId){
        this(orderId,100);
    }
    Order(){
        this("Burger1",120);
    }
    public String getOrderId(){
        return orderId;
    }
    public double getFoodPrice(){
        return foodPrice;
    }
    public void setOrderId(String orderId){
        this.orderId = orderId; 
    }
    public void setFoodPrice(double foodPrice){
        this.foodPrice = foodPrice;
    }
    public double calculateFinalPrice(){
        return foodPrice+0;
    }
    public void display(){
        System.out.println("Resturant's Name : " + restaurantName);
        System.out.println("Order Id : " +orderId);
        System.out.println("Price : " +foodPrice);
    }
}
class DineInOrder extends Order{
    double serviceCharge;
    DineInOrder(String orderId,double foodPrice,double serviceCharge){
        super(orderId,foodPrice);
        this.serviceCharge = serviceCharge;
    }
    DineInOrder(String orderId,double serviceCharge){
        super(orderId,100);
        this.serviceCharge = serviceCharge;
    }
    DineInOrder(){
        super("Burger1",100);
    }
    public void addServiceCharge(double amount){
        this.serviceCharge = amount;
    }
    public double calculateFinalPrice(){
        return foodPrice+serviceCharge;
    }
    public void display(){
        super.display();
        System.out.println("Service Charge : " + serviceCharge);
        System.out.println("Total Bill : " + calculateFinalPrice());
    }
}
class TakeawayOrder extends Order{
    double packingCharge;
    TakeawayOrder(String orderId,double foodPrice,double packingCharge){
        super(orderId,foodPrice);
        this.packingCharge = packingCharge;
    }
    TakeawayOrder(String orderId,double packingCharge){
        super(orderId,100);
        this.packingCharge = packingCharge;
    }
    TakeawayOrder(){
        super();
    }
    public void addPackingCharge(double amount){
        this.packingCharge = amount;
    }
    public double calculateFinalPrice(){
        return foodPrice+packingCharge;
    }
    public void display(){
        super.display();
        System.out.println("Packing Charge : " + packingCharge);
        System.out.println("Total Bill : " + calculateFinalPrice());
    }
}
class DeliveryOrder extends Order{
    double deliveryCharge,distance;

    DeliveryOrder(String orderId,double foodPrice,double deliveryCharge,double distance){
        super(orderId,foodPrice);
        this.deliveryCharge = deliveryCharge;
        this.distance = distance;
    }
    DeliveryOrder(String orderId,double deliveryCharge){
        super(orderId,100);
        this.deliveryCharge = deliveryCharge;
        this.distance = 20;
    }
    DeliveryOrder(){
        super();
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
    public void addDeliveryCharge(double amount){
        this.deliveryCharge = amount;
    }
    public double calculateFinalPrice(){
        return foodPrice+deliveryCharge+(distance*5);
    }
    public void display(){
        super.display();
        System.out.println("Delivery Charge : " + deliveryCharge);
        System.out.println("Distance : " + distance);
        System.out.println("Distance Charge : " + (distance*5));
        System.out.println("Total Bill : " + calculateFinalPrice());
    }
}
public class FoodOrder {
    public static void main(String[] args) {
        Order[] orders = new Order[3];
        orders[0] = new DineInOrder("Burger1",100,0);
        orders[1] = new TakeawayOrder("Pizza1",150,0);
        orders[2] = new DeliveryOrder("Sandwich1",120,0,10);
        for(int i=0;i<orders.length;i++){
            if(orders[i] instanceof DineInOrder){
                ((DineInOrder)orders[i]).addServiceCharge(50);
            }
            if(orders[i] instanceof TakeawayOrder){
                ((TakeawayOrder)orders[i]).addPackingCharge(70);
            }
            if(orders[i] instanceof DeliveryOrder){
                ((DeliveryOrder)orders[i]).addDeliveryCharge(60);
            }
            orders[i].display();
            System.out.println();
        }
    }
}
