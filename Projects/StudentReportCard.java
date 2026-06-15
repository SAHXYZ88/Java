import java.util.*;
class Student {
    private String name;
    private int rollNo;
    private int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    Student(String name, int rollNo) {
        this(name, rollNo, 0);
    }

    Student(String name) {
        this(name, 0, 0);
    }

    Student() {
        this("Unknow", 0, 0);
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        String grade = " ";
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public boolean isPass() {
        boolean pass = false;
        if (marks >= 40) {
            pass = true;
        } else {
            pass = false;
        }
        return pass;
    }

    public String toString() {
        return "Name : " + name + "\nRoll No : " + rollNo + "\nMarks : " + marks + "\nGrade : " + getGrade()
                + "\nPass/Fail Status : " + isPass();
    }
}

class InvalidMarksException extends RuntimeException {
    InvalidMarksException() {
        super("Marks must be between 0-100");
    }

}

class ReportCard {
    ArrayList<Student> students = new ArrayList<>();
    HashMap<Integer, Student> map = new HashMap<>();

    public void addStudent(Student s) {
        if (s.getMarks() < 0 || s.getMarks() > 100) {
            throw new InvalidMarksException();
        }
        students.add(s);
        map.put(s.getRollNo(), s);
    }

    public void viewStudent(int rollNo) {
        Student student = map.get(rollNo);
        if (student == null) {
            System.out.println("Student NO Found");
        } else {
            System.out.println(student);
        }
    }

    public void viewALl() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void viewFailed() {
        for (Student student : students) {
            if (!student.isPass()) {
                System.out.println(student);
            }
        }
    }

    public void viewTopper() {
        if (students.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }
        Student topper = students.get(0);
        for (Student student : students) {
            if (student.getMarks() > topper.getMarks()) {
                topper = student;
            }
        }
        System.out.println(topper);
    }

}
public class StudentReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReportCard reportCard = new ReportCard();

        while (true) {
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. View Topper");
        System.out.println("4. View Failed Students");
        System.out.println("5. View All Students");
        System.out.println("6. Exit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                System.out.print("Enter Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Enter Roll No: ");
                int rollNo = sc.nextInt();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();
                try {
                    Student student = new Student(name, rollNo, marks);
                    reportCard.addStudent(student);
                }
                catch (InvalidMarksException e) {
                    System.out.println(e.getMessage());
                }



                break;
            case 2:
                System.out.print("Enter Roll No: ");
                rollNo = sc.nextInt();

                reportCard.viewStudent(rollNo);

                break;
            case 3:
                reportCard.viewTopper();

                break;

            case 4:
                reportCard.viewFailed();

                break;

            case 5:
                reportCard.viewALl();

                break;

            case 6:
                return;

            default:
                System.out.println("Invalid Choice");
            }
        }
    }

}
