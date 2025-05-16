package DP;
import java.util.Arrays;

public class Fibo_Series {
    public static void main(String[] args) {
        int n = 5;
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);
       // System.out.println(fib(n,dp));
        System.out.println(fib2(5));

    }
    static int fib(int n, int [] dp){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = fib(n-1,dp)+fib(n-2,dp);
    }
    static int fib2(int n){ // Space optimization S(1)
        int prev2 = 0;
        int prev1 = 1;
        for(int i=2; i<=n; i++){
            int curri = prev2+prev1;
            prev2 = prev1;
            prev1 = curri;
        }
        return prev1;
    }
}
