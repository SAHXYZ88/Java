import java.util.*;

public class IteratorBasics {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("SAH");
        names.add("Rizwan");
        names.add("Zaid");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
    
}
