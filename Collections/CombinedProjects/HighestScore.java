import java.util.*;

public class HighestScore {
    public static void main(String[] args) {
        HashMap<String,Integer> students = new HashMap<>();
        students.put("Sah", 95);
        students.put("Zaid", 78);
        students.put("Purva", 88);
        students.put("Rizwan", 60);

        int max = 0;
        String topper = " ";
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                topper = entry.getKey();
            }
        }
        System.out.println("Highest Marks : " + max);
        System.out.println("Topper : " + topper);
    }

}
