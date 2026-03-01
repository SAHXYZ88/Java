class BankAccount{
    private long accountNumber;
    private String name;
    private double balance;
    BankAccount(long accountNumber,String name,double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    void display(){
        System.out.println("Account Number is " + accountNumber + " Account Holder's Name is " + name + " and The Total Balance In Your Account : " +balance);
    }

}

public class Banking {
    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount(54124, "SAHALAM", 500);
        ac1.display();
        ac1.deposit(5000);
        ac1.display();
    }
    
}
