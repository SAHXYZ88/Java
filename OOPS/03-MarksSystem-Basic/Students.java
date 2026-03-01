class Student{
    String name;
    int age;
    int rollno;

    Student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    void display(){
        System.out.println("Name Of The Student Is " + name + " Age Is " + age + " And Roll No Is  " + rollno);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sahalam",21,213);
        Student s2 = new Student("Zaid",22,133);

        s1.display();
        s2.display();
    }

}
