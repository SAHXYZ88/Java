import java.util.*;

class Student {
    String name;
    int rollNo;

    Student(String name,int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class ArrayListOfObjects {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sahalam", 213));
        students.add(new Student("Zaid", 133));
        students.add(new Student("Rizwan", 120));

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Name : " + students.get(i).name + " Roll No. : " + students.get(i).rollNo);
        }
    }
}
