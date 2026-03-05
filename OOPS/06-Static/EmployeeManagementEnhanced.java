class Employee{
    private String name;
    private int id;
    private double salary;
    private double bonus;

    static String companyName = "TechCorp";

    Employee(String name,int id,double salary,double bonus){
        this.name = name;
        this.id = id;
        this.salary = salary; 
        this.bonus = bonus;       
    }
    Employee(String name,int id){
        this(name,id,50000,0);
    }
    Employee(){
        this("SAH",213,50000,0);
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public void addBonus(double amount){
        if(amount <= 0 ){
            System.out.println("Invalid Bonus Ammoount");
        }
        else{
            bonus += amount;
        }
    }
    public double getTotal(){
        return salary + bonus;
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
    static void changeCompany(String newName){
        companyName = newName;
    }
    void display(){
        System.out.println(name + " " + id + " " + salary + " " + companyName + " " + bonus + " "  + getTotal());
    }
}

public class EmployeeManagementEnhanced {
    public static void main(String[] args) {
        Employee.companyName = "Google";
        Employee.changeCompany("Microsoft");
        Employee e1 = new Employee();
        Employee e2 = new Employee("SAH", 213);
        Employee e3 = new Employee("SAH", 213, 50000, 15000);
        
        e1.display();
        System.out.println();
        e2.display();
        e2.setID(100);
        e2.setSalary(65000);
        e2.addBonus(5000);
        e2.setName("SAHALAM");
        e2.display();
        System.out.println();
        e3.display();
    }
    
}
