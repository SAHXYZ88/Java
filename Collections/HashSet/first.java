import java.util.*;

public class first{
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("SAH");
        names.add("Zaid");
        names.add("Purva");

        for(String name : names){
            System.out.println(name);
        }
    }
}
