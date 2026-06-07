import java.util.*;

public class LinkedListBasics {
    public static void main(String[] args){
        LinkedList<String> players = new LinkedList<>();

        players.addFirst("SAH");
        players.addLast("Rizwan");
        players.addLast("Zaid");

        for (String player : players) {
            System.out.println(player);
        }
    }
}
