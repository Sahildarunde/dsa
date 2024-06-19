import java.util.*;

public class frog_jump{
    public static void main(String[] args){

        int height[]={30,10,60,10,60,50};
        int n=height.length;

        //tabulation with space optimization

        int prev = 0;
        int prev2 = 0;

        for(int i=1; i<n; i++){
            int fs = prev + Math.abs(height[i] - height[i-1]);
            int ss = Integer.MAX_VAlUE;
            if(i>1){
                ss = prev2 + Math.abs(height[i] - height[i-2]);
            }

            int curr = Math.min(fs, ss);
            prev = prev2;
            prev = curr;
        }

        System.out.println(prev);

    }

    // private static int memoization(int ind, int height[], int dp[]){
    //     if(ind == 0) return 0;

    //     if(dp[ind] != -1) return dp[ind];

    //     int left = memoization(ind-1, height, dp) + Math.abs(height[ind], height[ind-1]);
    //     int right = Integer.MAX_VAlUE;
    //     if(ind>1){
    //         right = memoization(ind-2, height, dp) + Math.abs(height[ind], height[ind-2]);
    //     }

    //     return dp[ind] = Math.min(left, right);
    // }
}