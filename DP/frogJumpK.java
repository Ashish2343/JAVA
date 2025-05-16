package DP;

import java.util.Arrays;

public class frogJumpK {
    public static void main(String[] args) {
        // Same question as frog jump but this time he can jump k steps
        int n  = 3;
        int []arr = {10,20,30,10};
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(energy(n,arr));
        //System.out.println(energyOpt(n,arr,dp));

    }
    static int energy(int n, int[]heights){
        if(n==0) return 0;
        int minSteps = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            if(n-i>=0) {
                int jump = energy(n-i, heights) + Math.abs((heights[n] - heights[n - i]));
                minSteps = Math.min(minSteps, jump);
            }
        }
        return minSteps;
    }
    // memoization
    static int energyOpt(int n, int [] heights, int[]dp){
        if(n==0) return 0;
        if(dp[n] != -1) return dp[n];
        int minSteps = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            if(n-i>=0){
                dp[i] = energyOpt(n-i,heights,dp) + Math.abs((heights[n] - heights[n - i]));
                minSteps = Math.min(minSteps, dp[i]);
            }
        }
        return minSteps;
    }

}
