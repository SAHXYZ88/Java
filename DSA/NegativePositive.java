import java.util.*;
public class NegativePositive {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            if(arr[left]>=0){
                left++;
            }
            else if(arr[right]<0){
                right--;
            }
            else{
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
