class Staff{
    protected String name;
    protected int id;
    protected double baseSalary;
    static String universityName = "ABC University";

    Staff(String name,int id,double baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    Staff(String name,int id){
        this(name,id,40000);
    }
    Staff(){
        this("Unknown",0,0);
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return baseSalary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    void display(){
        System.out.println("Name of The Staff is " + name + ", His Id is " + id + " and Base Salary is " + baseSalary + " University Name is " + universityName);
    }
}

class Professor extends Staff{
    double researchAllowance;
    Professor(String name,int id,double baseSalary,double researchAllowance){
        super(name,id,baseSalary);
        this.researchAllowance = researchAllowance;
    }
    Professor(String name,int id,double researchAllowance){
        super(name,id,0);
        this.researchAllowance = researchAllowance;
    }
    Professor(){
        super();
    }
    public void addAllowance(double amount){
        if(amount <= 0 ){
            System.out.println("Invalid Allowance Amount");
        }
        else{
            researchAllowance += amount;
        }
    }
    public double calculateTotalSalary(){
        return baseSalary+researchAllowance;
    }
    void display(){
        super.display();
        System.out.println("He Got Allowance of Rs " + researchAllowance + ", Now His Total Salary is " + calculateTotalSalary());
    }
}

class LabAssistant extends Staff{
    double labBonus;
    LabAssistant(String name,int id,double baseSalary,double labBonus){
        super(name, id, baseSalary);
        this.labBonus = labBonus;
    }
    LabAssistant(String name,int id,double labBonus){
        super(name,id,0);
        this.labBonus = labBonus;
    }
    LabAssistant(){
        super();
    }
    public void addLabBonus(double amount){
        if(amount <= 0){
            System.out.println("Invalid Bonus");
        }
        else{
            labBonus += amount;
        }
    }
    public double calculateTotalSalary(){
        return baseSalary + labBonus;
    }
    void display(){
        super.display();
        System.out.println("He Got Bonus of Rs " + labBonus + ", Now His Total Salary is " + calculateTotalSalary());
    }
}

public class StaffManagement {
    public static void main(String[] args) {
        Staff.universityName = "MIT";
        Professor p1 = new Professor();
        LabAssistant l1 = new LabAssistant();

        p1.setName("SAH");
        p1.setId(101);
        p1.setSalary(60000);
        p1.addAllowance(8000);
        p1.display();
        System.out.println();
        l1.setName("Ali");
        l1.setId(102);
        l1.setSalary(55000);
        l1.addLabBonus(5000);
        l1.display();
    }
}
