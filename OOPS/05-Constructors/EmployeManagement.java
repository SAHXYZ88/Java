class Employe{
    private String name;
    private int id;
    private double baseSalary;
    private double bonus;

    Employe(String name,int id,double baseSalary,double bonus){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    Employe(String name,int id,double baseSalary){
        this(name,id,baseSalary,0);
    }
    Employe(){
        this("Unknown",0,20000,0);
    }
    public String getEmployname(){
        return name;
    }
    public int getEmployeid(){
        return id;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public double getBonus(){
        return bonus;
    }
    public void inccreamentBonus(double amount){
        if(amount <= 0){
            System.out.println("Invalid Bonus Amount");
        }
        else{
            bonus += amount;
        }
    }
    public double calculateTotalSalary(){
        return baseSalary + bonus;       
    }

    void display(){
        System.out.println(name + " " + id + " " + baseSalary + " " + bonus + " " + calculateTotalSalary());
    }

}


public class EmployeManagement {
    public static void main(String[] args) {
        Employe emp1 = new Employe();
        Employe emp2 = new Employe("SAH", 213, 40000);
        Employe emp3 = new Employe("SAH", 213, 45000, 0);

        emp1.display();
        System.out.println();
        emp2.display();
        System.out.println();
        emp3.display();
        emp3.inccreamentBonus(10000);
        emp3.display();

    }
}
