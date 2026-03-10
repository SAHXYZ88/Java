abstract class Payment{
    String paymentId;
    double amount;
    static String platformName = "SPay";

    Payment(String paymentId,double amount){
        this.paymentId = paymentId;
        if(amount<0){
            System.out.println("Invalid Amount");
        }
        else{
            this.amount = amount;
        }
    }
    Payment(String paymentId){
        this(paymentId,100);
    }
    Payment(){
        this("ABC123",100);
    }
    public String getPaymentId(){
        return paymentId;
    }
    public double getAmount(){
        return amount;
    }
    public void setPaymentId(String paymentId){
        this.paymentId = paymentId;
    }
    public void setAmount(double amount){
        if(amount<0){
            System.out.println("Invalid Amount");
        }
        else{
            this.amount = amount;
        }    
    }
    abstract void calculateFee();
    abstract double calculateFinalAmount();

    public void display(){
        System.out.println("Payment ID : " +paymentId);
        System.out.println("Amount : " +amount);
        System.out.println("Platform : " +platformName);
    }
}
class CreditCardPayment extends Payment{
    double processingFee;
    CreditCardPayment(String paymentId,double amount,double processingFee){
        super(paymentId,amount);
        this.processingFee = processingFee;
    }
    CreditCardPayment(String paymentId,double processingFee){
        super(paymentId,100);
        this.processingFee = processingFee;
    }
    CreditCardPayment(){
        super();
    }
    public void calculateFee(){
        processingFee += (amount*0.02);
    }
    public double calculateFinalAmount(){
        return amount+processingFee;
    }
    public void display(){
        super.display();
        System.out.println("Fee : " +processingFee);
        System.out.println("Final Amount : " +calculateFinalAmount());
    }
}
class UpiPayment extends Payment{
    double transactionCharge;
    UpiPayment(String paymentId,double amount,double transactionCharge){
        super(paymentId,amount);
        this.transactionCharge = transactionCharge;
    }
    UpiPayment(String paymentId,double transactionCharge){
        super(paymentId,100);
        this.transactionCharge = transactionCharge;
    }
    UpiPayment(){
        super();
    }
    public void calculateFee(){
        transactionCharge = 5;
    }
    public double calculateFinalAmount(){
        return amount+transactionCharge;
    }
    public void display(){
        super.display();
        System.out.println("Fee : " +transactionCharge);
        System.out.println("Final Amount : " +calculateFinalAmount());
    }
}
public class PaymentSystem{
    public static void main(String[] args){
        Payment.platformName = "PayGate";
        Payment[] payments = new Payment[2];
        payments[0] = new CreditCardPayment("ABC123",1000,0);
        payments[1] = new UpiPayment("Upi123",1000,0);
  
        for(int i=0;i<payments.length;i++){
            if(payments[i] instanceof CreditCardPayment){
                ((CreditCardPayment)payments[i]).calculateFee();
            }
            if(payments[i] instanceof UpiPayment){
                ((UpiPayment)payments[i]).calculateFee();
            }
            payments[i].display();
            System.out.println();
        }
    }
}
