import java.util.*;

public class CollectionsMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(105);
        nums.add(25);
        nums.add(145);
        nums.add(50);
        for (Integer num : nums) {
            System.out.println(num);
        }
        System.out.println();
        System.out.println(Collections.min(nums));
        System.out.println(Collections.max(nums));
    }
    
}
