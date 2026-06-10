import java.util.ArrayList;

public class WildcardDemo {
    static void printList(ArrayList<?> list) {
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        names.add("SAH");
        names.add("Zaid");
        names.add("Rizwan");

        printList(names);

        numbers.add(213);
        numbers.add(133);
        numbers.add(264);

        printList(numbers);
        


    }
}
