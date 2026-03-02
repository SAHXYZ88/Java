class BankAccountAgain{
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    BankAccountAgain(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    BankAccountAgain(String accountHolderName, int accountNumber){
        this(accountHolderName,accountNumber,5000);
    }
    BankAccountAgain(){
        this("SAH",5146,10000);
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Please Enter The Amount Greater Than Zero");
        }
        else{
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid Amount");
        }
        else if(amount > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amount;
        }
    }
    void show(){
        System.out.println(accountHolderName + " " + accountNumber + " " + balance);
    }
}


public class BankAgain {
    public static void main (String[] args){
        BankAccountAgain bac1 = new BankAccountAgain();
        BankAccountAgain bac2 = new BankAccountAgain("SAH", 54587);
        BankAccountAgain bac3 = new BankAccountAgain("SAH", 54879, 50000);

        bac1.show();
        bac1.deposit(2000);
        bac1.show();
        System.out.println();

        bac2.show();
        bac2.deposit(2000);
        bac2.show();
        System.out.println();

        bac3.show();
        bac3.withdraw(10000);
        bac3.show();
    }
}
