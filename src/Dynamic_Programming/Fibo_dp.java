import java.util.*;
public class Fibo_dp {
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        //System.out.println(dp_fibo_recurrsion(n, dp)); /// recursion sc - o(n)stack-space + o(n)array, tc- o(n)


        // tabulation => this saves me from extra space-complexity. & also i;m not using arr to store. just variables.
        // sc-o(1) tc-o(n)
        int prev = 1, prev2 = 0;
        for(int i=2;i<=n;i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        System.out.println(prev);
    }
    static int dp_fibo_recurrsion(int n, int dp[]){
        if(n <= 1) return n;

        if(dp[n] != -1) return dp[n];
        return dp[n] = dp_fibo_recurrsion(n-1, dp) + dp_fibo_recurrsion(n-2, dp);
    }
}