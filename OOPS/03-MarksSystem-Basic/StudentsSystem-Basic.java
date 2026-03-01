import java.util.*;

class Students{
   private int n;
   private int m;
   private int marks[][];
   
   Students(int n, int m){
    this.n = n;
    this.m = m;
    this.marks = new int [n][m];
   }
   public void inputMarks(Scanner sc){
    for(int i=0;i<n;i++){
        for (int j=0;j<m;j++){
            System.out.println("Enter The Marks Of Student " + (i+1) + " for The Subject " + (j+1) + " : ");
            marks[i][j] = sc.nextInt();
        }
    }
   }

   void show(){
    for(int i=0;i<n;i++){
        System.out.println("The Marks Of Student "+(i+1));
        for(int j=0;j<m;j++){
            System.out.println("For The Subject "+(j+1) + " is : " + marks[i][j]);
        }
        System.out.println();
    }
   }
}
public class Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students(4,5);
        s1.inputMarks(sc);
        s1.show();
    }
}
