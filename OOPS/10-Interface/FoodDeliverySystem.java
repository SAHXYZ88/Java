interface DeliveryPartner {
    void deliver(String food);
}

class Swiggy implements DeliveryPartner{
    @Override
    public void deliver(String food) {
        System.out.println("Food Delivered by Swiggy : " + food);
    }
}
class Zomato implements DeliveryPartner {
    @Override
    public void deliver(String food) {
        System.out.println("Food Delivered By Zomato : " + food);
    }
}

class Dunzo implements DeliveryPartner {
    @Override
    public void deliver(String food) {
        System.out.println("Food Delivered By Dunzo : " + food);
    }
}

class FoodService {
    public void placeOrder(DeliveryPartner partner,String food) {
        partner.deliver(food);
    }
}
public class FoodDeliverySystem {
    public static void main(String[] Args) {
        FoodService service = new FoodService();
            service.placeOrder(
                new Swiggy(),
                "Chicken"
            );
            service.placeOrder(
                new Zomato(),
                "Biriyani"
            );
            service.placeOrder(
                new Dunzo(),
                "Sandwich"
            );
    }
}
