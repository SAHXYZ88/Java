interface PaymentMethod {
    void pay(double amount);
}

class UPI implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Via UPI : " + amount);
    }
}

class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Via CreditCard : " + amount);
    }
}

class DebitCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Via DebitCard : " + amount);
    }
}

class PaymentService {
    public void makePayment(PaymentMethod method,double amount){
        method.pay(amount);
    }
}


public class PaymentSystem {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.makePayment(
            new UPI(),
            5000
        );
        service.makePayment(
            new CreditCard(),
            6000
        );
        service.makePayment(
            new DebitCard(),
            10000
        );
    }    
}
