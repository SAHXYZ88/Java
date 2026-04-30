import java.util.*;

abstract class Company{
        static String companyName="SAHZ Tech";
        protected String name;
        protected int id;
        protected double salary;

        Company(String name, int id, double salary){
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        Company(String name, int id){
            this.name = name;
            this.id = id;
        }
        Company(){
            this("",0,0);
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
            System.out.println("Company Name : " +companyName);
            System.out.println("Name : " +name);
            System.out.println("ID : " +id);
            System.out.println("Salary : " +salary);
        }
    }
    class Employe extends Company{
        double bonus;

        Employe(String name,int id,double salary,double bonus){
            super(name,id,salary);
            this.bonus = bonus;
        }
        Employe(String name,int id){
            super(name,id,0);
            this.bonus = 0;
        }
        Employe(){
            super("",0,0);
        }
        public void addBonus(double amount){
            if(amount <=0){
                System.out.println("Invalid Bonus");
            }
            else{
                this.bonus = amount;
            }
        }
        public double calculateTotalSalary(){
            return salary+bonus;
        }
        @Override
        void display(){
            super.display();
            System.out.println("Bonus : " +bonus);
            System.out.println("Total Salary : " +calculateTotalSalary());
        }
    }
    class Manager extends Company{
        double allowance;
        Manager(String name,int id,double salary,double allowance){
            super(name,id,salary);
            this.allowance = allowance;
        }
        Manager(String name,int id){
            super(name,id,0);
            this.allowance = 0;
        }
        Manager(){
            super("",0,0);
        }
        public void addAllowance(double amount){
             if(amount <=0){
                System.out.println("Invalid Allowance");
            }
            else{
                this.allowance = amount;
            }
        }
        public double calculateTotalSalary(){
            return salary+allowance;
        }
        @Override
        void display(){
            super.display();
            System.out.println("Allowance : " +allowance);
            System.out.println("Total Salary : " +calculateTotalSalary());
        }
    }
public class CompanyManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company[] cmp = new Company[5]; 
        int count = 0;
            while(true) {
                System.out.println("Enter Your Choice : ");
                System.out.println("1. Enter Details");
                System.out.println("2. Check Details");
                System.out.println("3. Add Bonus");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1 :
                        System.out.println("Choose Type : ");
                        System.out.println("1. Employe");
                        System.out.println("2. Manger");
                        int type = sc.nextInt();
                        sc.nextLine();

                        if(count == cmp.length){
                            System.out.println("Storage Is Full");
                            break;
                        }
                        if (type == 1){
                        cmp[count] = new Employe();
                        System.out.println("Enter The Employe's Name : ");
                        cmp[count].setName(sc.nextLine());
                        System.out.println("Enter The Employe's Id : ");
                        cmp[count].setID(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Enter The Employe's Salary : ");
                        cmp[count].setSalary(sc.nextDouble());
                        count++;
                        }
                        else if(type == 2){
                        cmp[count] = new Manager();
                        System.out.println("Enter The Manager's Name : ");
                        cmp[count].setName(sc.nextLine());
                        System.out.println("Enter The Manager's Id : ");
                        cmp[count].setID(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Enter The Manager's Salary : ");
                        cmp[count].setSalary(sc.nextDouble());
                        count++;
                        }
                        break;
                    case 2 :
                        System.out.println("Choose Type : ");
                        System.out.println("1. Employe");
                        System.out.println("2. Manager");
                        type = sc.nextInt();
                        sc.nextLine();
                        if (type == 1){
                        System.out.println("\n---- All Employees ----");
                        for(int i=0;i< count;i++){
                            if(cmp[i]!=null && cmp[i] instanceof Employe){
                                ((Employe)cmp[i]).display();
                                System.out.println("----------------------");
                                }
                            }
                        }
                        else if(type == 2){
                        System.out.println("\n---- All Managers ----");
                        for(int i=0;i< count;i++){
                            if(cmp[i]!=null && cmp[i] instanceof Manager){
                                ((Manager)cmp[i]).display();
                                System.out.println("----------------------");
                                }
                            }
                        }
                        break;
                    case 3 :
                        System.out.println("Choose Type : ");
                        System.out.println("1. Employe");
                        System.out.println("2. Manager");
                        type = sc.nextInt();
                        sc.nextLine();
                        if (type == 1){
                            System.out.println("Enter Employe Id : ");
                            int empId = sc.nextInt();
                            sc.nextLine();
                            boolean found = false;
                            for(int i=0;i<count;i++){
                                if(cmp[i] != null && cmp[i].id == empId){
                                    if(cmp[i] instanceof Employe){
                                        System.out.println("Enter The Bonus Amount : ");
                                        ((Employe)cmp[i]).addBonus(sc.nextDouble());
                                        found = true;
                                    }
                                    break;
                                } 
                            }
                            if(!found){
                                    System.out.println("Invalid Employe Id");
                            }
                        }
                        else if(type == 2){
                            System.out.println("Enter Manager Id : ");
                            int mngId = sc.nextInt();
                            sc.nextLine();
                            boolean found = false;
                            for(int i=0;i<count;i++){
                                if(cmp[i] != null && cmp[i].id==mngId){
                                    if(cmp[i] instanceof Manager){
                                        System.out.println("Enter The Allowence Amount : ");
                                        ((Manager)cmp[i]).addAllowance(sc.nextDouble());
                                        found = true;
                                    }
                                    break;
                                }
                            }
                            if(!found){
                            System.out.println("Invalid Manager Id");
                            }
                    }
                    break;
                    case 4 :
                        return;
                    default:
                        System.out.println("Invalid Choice");
                }
            }  
        }
    }

