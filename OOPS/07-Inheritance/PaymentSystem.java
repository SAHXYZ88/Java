class Payment{
    protected String paymentId;
    protected double amount;
    protected String status;
    static String platformName = "PayGate";

    Payment(String paymentId,double amount,String status){
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = status;
    }
    Payment(String paymentId,double amount){
        this(paymentId,amount,"Pending");
    }
    Payment(){
        this("Unknown",0,"Pending");
    }
    public String getPaymentID(){
        return paymentId;
    }
    public double getAmount(){
        return amount;
    }
    public String getStatus(){
        return status;
    }
    public void setPaymentId(String paymentId){
        this.paymentId = paymentId;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setStatus(String status){
        this.status = status;
    }
    void display(){
        System.out.println("Payment Id : " + paymentId);
        System.out.println("Amount : " + amount);
        System.out.println("Status : " + status);
        System.out.println("Platform : " +platformName);
    }
}
class CreditCardPayment extends Payment{
    String cardNumber;
    String bankName;

    CreditCardPayment(String paymentId,double amount,String status,String cardNumber,String bankName){
        super(paymentId,amount,status);
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }
    CreditCardPayment(String paymentId,double amount,String cardNumber,String bankName){
        super(paymentId,amount,"Pending");
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }
    CreditCardPayment(){
        super("ABC01",0,"Pending");
        cardNumber = "Not Set";
        bankName = "Not Set";
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public String getBankName(){
        return bankName;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    public void processPayment(){
        this.status = "Completed";
    }
    void display(){
        super.display();
        System.out.println("Card Number : " +cardNumber);
        System.out.println("Bank Name : " + bankName);
    }
}
class UpiPayment extends Payment{
    String upiId;
    UpiPayment(String paymentId,double amount,String status,String upiId){
        super(paymentId,amount,status);
        this.upiId = upiId;
    }
    UpiPayment(String paymentId,double amount,String upiId){
        super(paymentId,amount,"Pending");
        this.upiId = upiId;
    }
    UpiPayment(){
        super();
        upiId = "Not Set";
    }
    public String getUpiId(){
        return upiId;
    }
    public void setUpiId(String upiId){
        this.upiId = upiId;
    }
    public void processPayment(){
        this.status = "Completed";
    }
    void display(){
        super.display();
        System.out.println("Upi Id : " +upiId);
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment.platformName = "RazorPay";
        
        CreditCardPayment c1 = new CreditCardPayment();
        UpiPayment u1 = new UpiPayment();

        c1.setCardNumber("1234-5678-0000");
        c1.setBankName("HDFC");
        c1.setAmount(2500);
        c1.setPaymentId("TXCN101");
        c1.processPayment();
        c1.display();
        System.out.println();
        u1.setUpiId("SAH@UPI");
        u1.setAmount(2500);
        u1.setPaymentId("TXN101");
        u1.processPayment();
        u1.display();
    }
}
