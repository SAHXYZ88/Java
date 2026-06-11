import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("students.txt", true);
            writer.write("\nSahil");
            System.out.println("Added The Text.");
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
