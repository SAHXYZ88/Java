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
public class UpdateEmployee {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employees = new HashMap<>();

        employees.put(1,new Developer("SAH", 1));
        employees.put(2, new Manager("Shabnur", 2));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Id To Search : ");
        int searchId = sc.nextInt();
        System.out.println("Enter The Name To Update : ");
        String newName = sc.next();

        if (employees.containsKey(searchId)) {
            Employee employee = employees.get(searchId);
            employee.display();
            System.out.println();
            employee.setName(newName);
            System.out.println("After Update : ");
            employee.display();
        }
        else {
            System.out.println("Employee Not Found");
        }
        sc.close();
    }
    
}
