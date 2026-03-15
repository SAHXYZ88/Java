import java.util.*;

abstract class Account{
    protected String name;
    protected int accountNumber;
    protected double balance;
    static String bankName = "ABC Bank";

    Account(String name,int accountNumber,double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    Account(String name,int accountNumber){
        this(name,accountNumber,0);
    }
    Account(){
        this("SAH",12345,0);
    }
    public String getName(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount");
        }
        else{
            balance += amount;
            System.out.println("You Have Successfully Deposoited " + amount + " RS");
        }
    }
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount");
        }
        else if(amount > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amount;
            System.out.println("You Have Successfully Withdrawn " + amount + " RS");
        }
    }
    abstract double calculateInterest();
    public void display(){
        System.out.println("Bank Name : " +bankName);
        System.out.println("Account Number : " +accountNumber);
        System.out.println("Name : " +name);
        System.out.println("Balance : " +balance);
    }
}
class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(String name,int accountNumber,double balance,double interestRate){
        super(name,accountNumber,balance);
        this.interestRate = interestRate;
    }
    SavingsAccount(String name,int accountNumber,double interestRate){
        super(name,accountNumber,0);
        this.interestRate = interestRate;
    }
    SavingsAccount(){
        super("SAH",12345,0);
        this.interestRate = 0;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public double calculateInterest(){
        double interest = balance*interestRate/100;
        return interest;
    }
    public void display(){
        super.display();
        System.out.println("Interest : " +calculateInterest());
    }
}
class CurrentAccount extends Account{
    int transactionCount;
    CurrentAccount(String name,int accountNumber,double balance,int transactionCount){
        super(name,accountNumber,balance);
        this.transactionCount = transactionCount;
    }
    CurrentAccount(String name,int accountNumber,int transactionCount){
        super(name,accountNumber,0);
        this.transactionCount = transactionCount;
    }
    CurrentAccount(){
        super("SAH",12345,0);
        this.transactionCount = 0;
    }
    public int getTransactionCount(){
        return transactionCount;
    }
    public void setTransactionCount(int transactionCount){
        this.transactionCount = transactionCount;
    }
    public void addTransaction(){
        transactionCount++;
    }
    public double calculateInterest(){
        return 0;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Account.bankName = "SAH Bank";
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[2];
        for(int i = 0;i<accounts.length;i++){
            System.out.println("Choose The Type Of Account : ");
            System.out.println("1. Savings Account.");
            System.out.println("2. Current Acoount.");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter Name : ");
                String name = sc.next();
                System.out.println("Enter Account Number : ");
                int accountNumber = sc.nextInt();
                System.out.println("Enter Balance : ");
                double balance = sc.nextDouble();
                System.out.println("Enter Interest Rate : ");
                double interestRate = sc.nextDouble();
                accounts[i] = new SavingsAccount(name,accountNumber,balance,interestRate);
            }
            else if (choice==2){
                System.out.println("Enter Name : ");
                String name = sc.next();
                System.out.println("Enter Account Number : ");
                int accountNumber = sc.nextInt();
                System.out.println("Enter Balance : ");
                double balance = sc.nextDouble();
                System.out.println("Enter Transaction Count : ");
                int transactionCount = sc.nextInt();
                accounts[i] = new CurrentAccount(name,accountNumber,balance,transactionCount);
            }
            else{
                System.out.println("Invalid Choice.");
                i--;
                continue;
            }
            while(true){
            System.out.println("Enter Your Choice : ");
            System.out.println("1. See Account Details.");
            System.out.println("2. Withdraw Balance.");
            System.out.println("3. Deposit Balance.");
            System.out.println("4. Exit.");

            choice = sc.nextInt();

            switch(choice){
                case 1 :
                    System.out.println("Your Account Details : ");
                    System.out.println();
                    accounts[i].display();
                    System.out.println();
                    break;
                case 2 : 
                    System.out.println();
                    System.out.println("Enter The Amount To WIthdraw : ");
                    double amount = sc.nextDouble();
                    accounts[i].withdraw(amount);
                    if(accounts[i] instanceof CurrentAccount){
                        ((CurrentAccount)accounts[i]).addTransaction();
                    }
                    accounts[i].display();
                    System.out.println();
                    break;
                case 3 :
                    System.out.println();
                    System.out.println("Enter The Amount To Deposit : ");
                    amount = sc.nextDouble();
                    accounts[i].deposit(amount);
                    if(accounts[i] instanceof CurrentAccount){
                        ((CurrentAccount)accounts[i]).addTransaction();
                    }
                    accounts[i].display();
                    System.out.println();
                    break;
                case 4 : 
                    System.out.println("Exiting...");
                    return;
                default :
                    System.out.println("Invalid Choice");
            }
        }
        }
        
    }
}
