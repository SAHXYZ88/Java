import java.util.*;

public class FrequencyCount {
    public static void main(String[]args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {1, 2, 3, 2, 1, 3, 3, 4};

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue() + " Times ");
        }

    }
}
