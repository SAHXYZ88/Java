import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try{
        java.io.FileReader file = new java.io.FileReader("abc.txt");
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
