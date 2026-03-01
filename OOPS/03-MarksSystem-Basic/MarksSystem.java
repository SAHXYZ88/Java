import java.util.*;

class MarksSystem {
    Scanner sc = new Scanner(System.in);

    private String name[];
    private int rollno[];
    private int n;
    private int m;
    private int [][] marks;

    MarksSystem(int n,int m){
        this.name = new String [n];
        this.rollno = new int[n];
        this.marks = new int[n][m];
        this.n = n;
        this.m = m;        
    }
    public void getName(){
        for(int i=0;i<n;i++){
            System.out.println("Enter The Name Of Student " + (i+1) + " : ");
            this.name[i] = sc.next(); 
        }
    }
    public void getRollno(){
        for(int i=0;i<n;i++){
            System.out.println("Enter The Roll No of Student " + (i+1) + " : ");
            this.rollno[i] = sc.nextInt();
        }
    }
    public void getMarks(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){ 
                System.out.println("Enter The Marks of Student " + (i+1) + " for The Subject " + (j+1) + " : ");
                this.marks[i][j] = sc.nextInt();
            }
        }
    }
    void display(){
        for(int i=0;i<n;i++){
            System.out.println("Name Of Student "+ (i+1) +" is "+ name[i] + " and Roll No is " + rollno[i]);
            for(int j=0;j<m;j++){
                System.out.println("He Got " + marks[i][j] + " in The Subject " + (j+1));
            }
        }   
    }
}
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Students : ");
        int n = sc.nextInt();
        System.out.println("Enter The Number Of Subjects : ");
        int m = sc.nextInt();

        MarksSystem students = new MarksSystem(n,m);

        students.getName();
        students.getRollno();
        students.getMarks();
        
        students.display();
    }
}
