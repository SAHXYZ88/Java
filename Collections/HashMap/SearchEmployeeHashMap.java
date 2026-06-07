import java.util.HashMap;

class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
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

public class SearchEmployeeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employees = new HashMap<>();

        employees.put(1,new Developer("SAH", 1));
        employees.put(2, new Manager("Shabnur", 2));
        
        int searchId = 2;

        if (employees.containsKey(searchId)) {
            Employee employee = employees.get(searchId);
            employee.display();
        }
        else {
            System.out.println("Employee Not Found");
        }
    }
    
}
