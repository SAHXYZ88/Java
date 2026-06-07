import java.util.*;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> nums = new PriorityQueue<>();

        nums.add(107);
        nums.add(25);
        nums.add(145);
        nums.add(50);

        while (!nums.isEmpty()) {
            System.out.println(nums.poll());
        }
    }
    
}
