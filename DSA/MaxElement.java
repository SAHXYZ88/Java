public class MaxElement{
    public static void main(String[] args){
        int[] nums = {3, 7, 1, 9, 4, 6};
        int max = 0;
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex = i;
            }
        }
        System.out.println("Maximum Element is : " +max);
        System.out.println("Maximum Element Index : " +maxIndex);
    }
}
