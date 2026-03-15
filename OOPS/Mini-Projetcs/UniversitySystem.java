import java.util.*;

abstract class Person{
    protected String name;
    protected int  id;
    protected String email;

    Person(String name,int id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }
    Person(String name,int id){
        this(name,id,"Unknown@mail.com");
    }
    Person(){
        this("Unknown",0,"Unknown@email.com");
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void display(){
        System.out.println("Name : " +name);
        System.out.println("Id : " +id);
        System.out.println("Email : " +email);

    }
}
class Course {
    int courseId;
    String courseName;
    int credits;

    Course(int courseId,String courseName,int credits){
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public void display(){
        System.out.println("Course Name : " +courseName);
        System.out.println("Course Id : " +courseId);
        System.out.println("Credits : " +credits);
    }
}
class Student extends Person{
    int studentId;
    String department;
    Course[] enrolledCourses;
    int courseCount = 0;

    Student(String name,int id,String email,int studentId,String department){
        super(name,id,email);
        this.studentId = studentId;
        this.department = department;
    }
    Student(String name,int id,int studentId,String department){
        super(name,id,"Unknown@mail.com");
        this.studentId = studentId;
        this.department = department;
    }
    Student(){
        super();
        this.studentId = 0;
        this.department = "Unknown";
    }
    public void enrollCourse(Course course){
        if(enrolledCourses == null){
            enrolledCourses = new Course[5];
        }
        if(courseCount < enrolledCourses.length){
            enrolledCourses[courseCount] = course;
            courseCount++;

            System.out.println("Enrolled in The Course Successfully");
        }
        else{
            System.out.println("Cant Enroll In More Courses");
        }
    }
    public void display(){
        super.display();
        System.out.println("Student Id : " +studentId);
        System.out.println("Department : " +department);
        if(courseCount == 0 ){
            System.out.println("Not Enrolled In Courses");
        }
        else{
            System.out.println("Enrolled Courses : ");
            for(int i=0;i<courseCount;i++){
                System.out.println(enrolledCourses[i].courseName);
            }
        }
    }

}

public class UniversitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student [] students = new Student[5];
        Course [] courses = new Course[5];
        int studentCount = 0;
        int courseCount = 0;

        while(true){
            System.out.println("Enter Your Choice : ");
            System.out.println("1. Register Student.");
            System.out.println("2. Add Course.");
            System.out.println("3. Enroll Student.");
            System.out.println("4. View Student.");
            System.out.println("5. Exit.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1 :
                    System.out.println("!---Register Student---!");
                    System.out.println();
                    System.out.println("Enter The Name Of Student : ");
                    String name = sc.nextLine();
                    System.out.println("Enter ID Number : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student's Email Id : ");
                    String email = sc.nextLine();
                    System.out.println("Enter The Student's ID : ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter The DepartMent : ");
                    String department = sc.nextLine();
                    if(studentCount == students.length){
                        System.out.println("Student limit reached");
                        break;
                    }
                    Student s = new Student(name,id,email,studentId,department);
                    students[studentCount] = s;
                    studentCount++;
                    System.out.println("Student Registered Successfully");
                    break;
                case 2 :
                    System.out.println();
                    System.out.println("!---Add Course---!");
                    System.out.println("Enter The Course ID : ");
                    int courseId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter The Course Name : ");
                    String courseName = sc.nextLine();
                    System.out.println("Enter Credits : ");
                    int credits = sc.nextInt();
                    sc.nextLine();

                    if(courseCount == courses.length){
                        System.out.println("Course Limit Have Reached");
                        break;
                    }
                    Course c = new Course(courseId, courseName, credits);
                    courses[courseCount] = c;
                    courseCount++;
                    System.out.println("Course Added Successfully");
                    System.out.println();
                    break;
                case 3 :
                    System.out.println();
                    System.out.println("!---Enroll Student---!");
                    System.out.println("Enter The Student ID : ");
                    studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter The Course ID : ");
                    courseId = sc.nextInt();
                    System.out.println();
                    Student targetStudent = null;
                    Course targetCourse = null;
                    for(int i=0;i<studentCount;i++){
                        if(students[i].studentId == studentId){
                            targetStudent = students[i];
                            break;
                        } 
                    }
                    for(int i=0;i<courseCount;i++){
                        if(courses[i].courseId == courseId){
                            targetCourse = courses[i];
                            break;
                        }
                    }
                    if(targetStudent !=null && targetCourse !=null){
                        targetStudent.enrollCourse(targetCourse);
                        System.out.println("Student Enrolled Successfully.");
                    }
                    else{
                        System.out.println("Student or Course Not Found");
                        System.out.println();
                    }
                    break;
                case 4 :
                    System.out.println("View Student");
                    for(int i=0;i<studentCount;i++){
                        if(students[i] != null){
                            System.out.println();
                            students[i].display();
                        }
                    }
                    for(int i=0;i<courseCount;i++){
                        if(courses[i]!=null){
                            courses[i].display();
                            System.out.println();
                        }
                    }
                    break;
                case 5 :
                    System.out.println("Exiting..");
                    return;
                default :
                    System.out.println("Invalid Choice");
            }
        }
    }
}
