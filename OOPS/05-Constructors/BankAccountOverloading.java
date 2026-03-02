class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(){
        accountHolder = "SAH";
        accountNumber = 321458;
        balance = 500;
    }
    BankAccount(String accountHolder, int accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        balance = 500;
    }
    BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountHolderName(){
        return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Please Enter The Amount Greater Than Zero");
        }
        else{
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient Balance");
        }
        else if(amount <=0){
            System.out.println("Invalid Amount");
        }
        else{
            balance -= amount;
        }
    }
    void display(){
        System.out.println(accountHolder + " " + accountNumber + " " +balance);
    }
}


public class Bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("SAH", 5467);
        BankAccount acc3 = new BankAccount("SAH", 4589, 5000);

        acc1.display();
        acc1.deposit(5000);
        acc1.display();
        System.out.println();
        acc2.display();
        acc2.deposit(200);
        acc2.display();
        System.out.println();
        acc3.display();
        acc3.withdraw(2000);
        acc3.display();
    }
}
