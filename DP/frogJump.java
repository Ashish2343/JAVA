package DP;

import java.util.Arrays;

public class frogJump {
    public static void main(String[] args) {
        int n  = 3;
        int []arr = {10,20,30,10};
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println(energy(n,arr));
      System.out.println(energyDP(n,arr,dp));
       // System.out.println(energyOpt(4,arr));
        //System.out.println(energyOpt2(4,arr));
    }
    static int energy(int n, int heights[]){
        if(n==0){
            return 0;
        }
        int left = energy(n-1,heights) + Math.abs((heights[n]-heights[n-1]));
        int right = Integer.MAX_VALUE;
        if(n>1){
             right = energy(n-2,heights)+ Math.abs((heights[n]-heights[n-2]));
        }
        return Math.min(left,right);
    }
    static int energyDP(int n, int heights[], int []dp){
        if(n==0) return 0;
        if(dp[n] != -1) return dp[n];
        int left = energyDP(n-1,heights,dp) + Math.abs((heights[n]-heights[n-1]));
        int right = Integer.MAX_VALUE;
        if(n>1){
            right = energyDP(n-2,heights,dp)+ Math.abs((heights[n]-heights[n-2]));
        }
        return dp[n] = Math.min(left,right);
    }
    static int energyOpt(int n, int heights[]){
            int [] dp = new int [n];
            dp[0] = 0;
            for(int i=1; i<n; i++){
                int fs = dp[i-1] + Math.abs(heights[i]-heights[i-1]);
                int ss = Integer.MAX_VALUE;
                if(i>1){
                    ss = dp[i-2] + Math.abs(heights[i]-heights[i-2]);
                }
                dp[i] = Math.min(fs,ss);
            }
            return dp[n-1];
    }
    static int energyOpt2(int n, int heights[]){
        int prev = 0;
        int curr;
        int prev2 = 0;
        for(int i=1; i<n; i++){
            int fs = prev + Math.abs(heights[i]-heights[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1){
                ss = prev2 + Math.abs(heights[i]-heights[i-2]);
            }
            curr = Math.min(fs,ss);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

}
