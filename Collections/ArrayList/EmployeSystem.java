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

public class EmployeSystem{
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Developer("SAH", 213));
        employees.add(new Manager("Shabnur", 01));

        for (Employee employee : employees) {
            employee.display();
        }
    }
}
