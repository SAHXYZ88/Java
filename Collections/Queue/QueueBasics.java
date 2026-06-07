import java.util.*;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<String> players = new LinkedList<>();

        players.add("SAH");
        players.add("Rizwan");
        players.add("Zaid");

        for (String player : players) {
            System.out.println(player);
        }

        players.poll();
        System.out.println();
        System.out.println("-: After Removing :- ");
        for (String player : players) {
            System.out.println(player);
        }
    }
}
