import java.util.*;

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

public class RemoveEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Developer("SAH", 213));
        employees.add(new Manager("Shabnur", 01));
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Id You Want To Search : ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == searchId) {
                found = true;
                employees.remove(i);
                System.out.println("Employee Removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee Not Found");
        }
        System.out.println();
        System.out.println("Remaining Employees:");

        for (Employee employee : employees) {
            employee.display();
        }
        
    }
}
