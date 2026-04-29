import java.util.*;

public class first{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"SAH");
        map.put(2,"Zaid");
        map.put(3,"Purva");

        for(int key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
