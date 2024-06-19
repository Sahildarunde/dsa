class house_robbery {
    public int rob(int[] nums) {
        int n = nums.length;
        // int[] dp = new int[n];
        // Arrays.fill(dp, -1);
        // return f(n-1, nums, dp);

        int prev = nums[0];
        int prev2 = 0;

        for(int i=1; i<n; i++){
            int pick = nums[i];

            if(i>1) pick += prev2;

            int nonPick = prev;

            int curr = Math.max(pick, nonPick);
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
    // int f(int n, int[] nums, int[] dp){
    //     if(n < 0) return 0;
    //     if(n == 0) return nums[n];
    //     if(dp[n] != -1) return dp[n];

    //     int pick = nums[n] + f(n-2, nums, dp);
    //     int nonPick = 0 + f(n-1, nums, dp);
        

    //     return dp[n] = Math.max(pick, nonPick);

    // }
}