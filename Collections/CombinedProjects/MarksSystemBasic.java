import java.util.*;

public class MarksSystemBasic{
    public static void main(String[] args) {
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        HashMap<String,Integer> marks = new HashMap<>();

        id.add(213);
        id.add(133);
        id.add(199);
        names.add("Sah");
        names.add("Zaid");
        names.add("Purva");

        marks.put("Sah",85);
        marks.put("Zaid",78);
        marks.put("Purva",74);
        int passCount = 0;
        int failCount = 0;
        int max = 0;
        String topperName = "";

        for(int i=0;i<id.size();i++){
            int idNo = id.get(i);
            String name = names.get(i);
            int mark = marks.get(name);            
            if(mark>=75){
                System.out.println(name + " : " + idNo + " : " + mark);
                System.out.println("Passed");
                passCount++;
            }
            else{
                System.out.println(name + " : " + idNo + " : " + mark);
                System.out.println("Failed");
                failCount++;
            }
            if(mark > max){
                max = mark;
                topperName = name; 
            }
        }
        System.out.println("Passed Students : " +passCount);
        System.out.println("Failed Students : " +failCount);
        System.out.println("Maximum Marks : " + max + " Topper's Name : " +topperName);
    }
}
