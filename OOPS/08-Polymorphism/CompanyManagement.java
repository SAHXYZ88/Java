class Employee{
    protected String name;
    protected int id;
    protected double salary;
    static String companyName = "Google";

    Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    Employee(String name,int id){
        this(name,id,0);
    }
    Employee(){
        this("SAH",0,0);
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
       this.name = name;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    void display(){
        System.out.println("Eployee's Name is " + name + ",Id is " + id + " and Base Salary is " + salary + " " + " Company : " + companyName);
    }
}
class Developer extends Employee{
    double bonus;
    Developer(String name,int id,double salary,double bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }
    Developer(String name,int id,double bonus){
        super(name, id,0);
        this.bonus = bonus;
    }
    Developer(){
        super();
    }
    public void addBonus(double amount){
        if(amount <= 0){
            System.out.println("Invalid Bonus");
        }
        else{
            bonus += amount;
        }
    }
    public double calculateTotalSalary(){
        return salary + bonus;
    }
    void display(){
        super.display();
        System.out.println("He Got Bonus of Rs " + bonus + " " + " And His Total Salary is " +calculateTotalSalary());
    }
}
class Manager extends Employee{
    double allowance;
    Manager(String name,int id,double salary,double allowance){
        super(name,id,salary);
        this.allowance = allowance;
    }
    Manager(String name,int id,double allowance){
        super(name,id,70000);
        this.allowance = allowance;
    }
    Manager(){
        super();
    }
    public double calculateTotalSalary(){
        return salary + allowance;
    }
    public void addAllowance(double amount){
        if(amount <= 0){
            System.out.println("Invalid Allowance");
        }
        else{
            allowance += amount;
        }
    }
    void display(){
        super.display();
        System.out.println("He Got " + allowance + " Rs Allowance and Now His Total Salary is " + calculateTotalSalary());
    }
}

public class CompanyManagement {
    public static void main(String[] args) {
        Employee.companyName = "Microsoft";
        Employee[] employee = new Employee[2];
        employee[0] = new  Developer("SAH",213,80000,0);
        employee[1] = new Manager("Ali",123,65000,0);
        for(int i=0;i<employee.length;i++){
            if(employee[i] instanceof Developer){
                ((Developer)employee[i]).addBonus(10000);
            }
            if(employee[i] instanceof Manager){
                ((Manager)employee[i]).addAllowance(15000);
            }
            employee[i].display();
            System.out.println();
        }
    }
}
