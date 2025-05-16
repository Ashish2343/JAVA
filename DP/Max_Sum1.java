package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class Max_Sum1 {
    public static void main(String[] args) {
        int [] arr =  {2,1,4,9};
        System.out.println(maxSum1(3,arr));
        int [] dp = new int[5];
        Arrays.fill(dp,-1);
        System.out.println(maxSum2(3,arr,dp));
        System.out.println(maxsum3(4,arr,dp));
        System.out.println(maxsum4(4,arr));
    }
    // calculate the maximum sum by adding the non-adjacent elements in array
    static int maxSum1(int ind, int[]arr){ // Brute force
        if(ind==0) return arr[ind];
        if(ind<0) return 0;
        int pick = arr[ind]+maxSum1(ind-2,arr);
        int nonpick  =  maxSum1(ind-1,arr);
        return Math.max(pick,nonpick);
    }
    static int maxSum2(int ind, int []arr, int[]dp){ // memoization
        if(ind==0) return arr[ind];
        if(ind<0) return 0;
        if(dp[ind] != -1) return dp[ind];
        int pick = arr[ind]+maxSum2(ind-2,arr,dp);
        int nonpick  =  maxSum2(ind-1,arr,dp);
        return  dp[ind] = Math.max(pick,nonpick);
    }
    static int maxsum3(int ind, int []arr, int []dp){ // Tabulation
        dp[0] = arr[0];
        for(int i=1; i<ind; i++){
            int pick = arr[i];
            if(i>1) pick = pick+dp[i-2];
            int nonpick = dp[i-1];
            dp[i] = Math.max(pick,nonpick);
        }
        return dp[ind-1];
    }
    static int maxsum4(int ind, int []arr){ // Space-Optimization
        int prev = arr[0];
        int prev2 = 0;
        for(int i=1; i<ind; i++){
            int pick = arr[i];
            if(i>1) pick = pick+prev2;
            int nonpick = prev;
            int curri = Math.max(pick,nonpick);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }

}
