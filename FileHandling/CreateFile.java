import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("students.txt");
        try{
            boolean created = file.createNewFile();
            if (created == false) {
                System.out.println("File Already Exists");
            }
            else {
                System.out.println("File Created Successfully");
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}
