import java.util.*;

class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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
        HashMap<Integer, Employee> employees = new HashMap<>();

        employees.put(1,new Developer("SAH", 1));
        employees.put(2, new Manager("Shabnur", 2));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Id To Remove : ");
        int searchId = sc.nextInt();

        if (employees.containsKey(searchId)) {
            Employee employee = employees.get(searchId);
            System.out.println("Employee Found : ");
            employee.display();

            employees.remove(searchId);
            System.out.println("Employee Removed.");
            
            System.out.println("\nRemaining Employees:");

            for (int id : employees.keySet()) {
                employees.get(id).display();
            }
        }
        else {
            System.out.println("Employee Not Found");
        }

        sc.close();
    }
    
}
