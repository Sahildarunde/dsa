import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        //use two pointer technique

        Arrays.sort(arr);
        int left = 0, right = n-1;
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        while(left<right){
            if(arr[left]+arr[right] == target){
                ans[0] = left;
                ans[1] = right;
                return;
            } else if (arr[left] + arr[right] < target) {
                    left++;
            }else{
                right--;
            }
        }
        System.out.print(ans[0] + " " + ans[1]);
    }
}