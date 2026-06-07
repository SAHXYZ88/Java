import java.util.*;

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
public class HashSetOfObjects {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Developer("SAH", 1));
        employees.add( new Manager("Shabnur", 2));
        
        for (Employee employee : employees) {
            employee.display();
        }
    }
}
