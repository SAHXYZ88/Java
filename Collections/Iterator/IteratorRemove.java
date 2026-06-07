import java.util.*;

public class IteratorRemove {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("SAH");
        names.add("Rizwan");
        names.add("Zaid");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();

            if (name.equals("Rizwan")) {
                it.remove();
            }
        }
        for (String name : names) {
        System.out.println(name);
        }
    }
    
}
