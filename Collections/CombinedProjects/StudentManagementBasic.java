import java.util.*;


public class StudentManagementBasic{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        names.add("Sah");
        names.add("Zaid");
        names.add("Purva");
        names.add("Rizwan");

        map.put("Sah",485);
        map.put("Zaid",455);
        map.put("Purva",450);
        map.put("Rizwan",480);

        for(int i=0;i<names.size();i++){
            String name = names.get(i);
            int marks = map.get(name);
            System.out.println(name + " : " + marks);
        }
    }
}
