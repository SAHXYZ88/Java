import java.util.*;

public class StudentList {
    public static void main(String [] args){
        ArrayList<String> students = new ArrayList<>();
        students.add("SAH");
        students.add("Zaid");
        students.add("Purva");
        students.add("Rizwan");
        students.add("Aryan");

        System.out.println(students.size());

        System.out.println(students.contains("Purva"));
        System.out.println(students.contains("Rohan"));

        students.remove(2);
        students.remove("Rizwan");

        for(String student : students){
            System.out.println(student);
        }
        System.out.println(students.size());

    }

}
