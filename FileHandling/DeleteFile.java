import java.io.*;

public class DeleteFile {
    public static void main(String[] args) {
        
        File file = new File("students.txt");
        boolean deleted = file.delete();
        if (deleted == true) {
            System.out.println("File Deleted Successfully.");
        }
        else {
            System.out.println("File Not Found");
        }
    }

    
}
