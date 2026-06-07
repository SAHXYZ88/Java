import java.util.*;

public class LinkedListBasics {
    public static void main(String[] args){
        LinkedList<String> players = new LinkedList<>();

        players.addFirst("SAH");
        players.addLast("Rizwan");
        players.addLast("Zaid");

        players.removeFirst();

        System.out.println("After Removing First : ");
        for (String player : players) {
            System.out.println(player);
        }

        players.removeLast();
        System.out.println();

        System.out.println("After Removing Last : ");
        for (String player : players) {
            System.out.println(player);
        }
    }
}
