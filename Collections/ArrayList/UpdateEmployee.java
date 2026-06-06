import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

class Developer extends Employee {
    Developer(String name, int id) {
        super(name, id);
    }

    @Override
    void display() {
        System.out.println("-: Developer :-");
        super.display();
    }
}

class Manager extends Employee {
    Manager(String name, int id) {
        super(name, id);
    }
    
    @Override
    void display() {
        System.out.println("-: Manager :-");
        super.display();
    }
}
public class UpdateEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        
        employees.add(new Developer("SAH", 213));
        employees.add(new Manager("Shabnur", 01));
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Id You Want To Search : ");
        int searchId = sc.nextInt();
        
        boolean found = false;

        for (Employee employee : employees) {
            if (employee.getId() == searchId) {
                found = true;
                employee.display();
                System.out.println();
                System.out.println("Enter The New Name You Want To Set : ");
                String newName = sc.next();
                employee.setName(newName);
                System.out.println();
                employee.display();
            }
        }
        if (!found) {
            System.out.println("Employee Not Found");
        }
    }
}
