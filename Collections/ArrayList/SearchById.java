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
public class SearchById {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Developer("SAH", 213));
        employees.add(new Manager("Shabnur", 01));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Id You Want To Search : ");
        int searchId = sc.nextInt();

        for (Employee employee : employees) {
            if (employee.getId() == searchId) {
                System.out.println("Employee Found");
                employee.display();
            }
        }  
    }
}
