import java.util.*;

public class first{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("SAH");
        names.add("Zaid");
        names.add("Purva");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println();

        for(int i=0;i<names.size();i++){
            System.out.println(i + " " + names.get(i));
        }
    }
}
