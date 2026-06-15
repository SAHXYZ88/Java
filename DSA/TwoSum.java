import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] nums = {2,7,8,11,15};
        int target = 10;
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                System.out.println("Index 1 : " + map.get(compliment));
                System.out.println("Index 2 : " + i);
            }
            else{
                map.put(nums[i],i);
            }
        }


    }

}
