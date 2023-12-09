import java.util.*;
public class Fibo_dp {
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(dp_fibo(n, dp));
    }
    static int dp_fibo(int n, int dp[]){
        if(n <= 1) return n;

        if(dp[n] != -1) return dp[n];
        return dp[n] = dp_fibo(n-1, dp) + dp_fibo(n-2, dp);
    }
}