import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try{
        FileWriter writer = new FileWriter("students.txt");
        writer.write("SAH\nZaid\nRizwan");
        System.out.println("Added To File");
        writer.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
