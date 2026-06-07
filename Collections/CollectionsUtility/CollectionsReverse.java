import java.util.*;
public class CollectionsReverse {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(105);
        nums.add(25);
        nums.add(145);
        nums.add(50);
        for (Integer num : nums) {
            System.out.println(num);
        }
        Collections.sort(nums);
        Collections.reverse(nums);
        System.out.println();
        for (Integer num : nums) {
            System.out.println(num);
        }

    }
}
