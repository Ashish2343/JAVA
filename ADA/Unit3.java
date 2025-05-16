package ADA;

import java.util.ArrayList;
import java.util.Arrays;

public class Unit3 {
    public static void main(String[] args) {
        int n = 5;
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);
        int x =   Climb(n,0,dp);
        System.out.println(x);
    }
    public static int Climb(int n,int ans, int [] arr){
        if(n==0){
            return 1;
        }
        if(arr[n] != -1){
            return arr[n];
        }
        ans = Climb(n-1,ans,arr);
        if(n>1){
            ans = ans + Climb(n-2,ans,arr);
        }
        arr[n] = ans;
        return (ans);
    }
    static int energyDP(int n, int heights[], int []dp){
        if(n==0) return 0;
        if(dp[n] != -1) return dp[n];
        int left = energyDP(n-1,heights,dp) + Math.abs((heights[n]-heights[n-1]));
        int right = Integer.MAX_VALUE;
        if(n>1){
            right = energyDP(n-2,heights,dp) + Math.abs((heights[n]-heights[n-2]));
        }
        return dp[n] = Math.min(left,right);
    }
    static long RobHouse(ArrayList<Integer> arr, int n){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        if(n==1) return arr.get(0);
        for(int i=0; i<n; i++){
            if(i !=0) arr1.add(arr.get(i));
            if(i != n-1) arr2.add(arr.get(i));
        }
        long ans1 = houseRobber(arr1,arr1.size()-1);
        long ans2 = houseRobber(arr2,arr2.size()-1);
        return Math.max(ans1,ans2);
    }
    static long houseRobber(ArrayList<Integer>valueInHouse, int ind){
        if(ind==0) return valueInHouse.get(0);
        if(ind<0) return 0;
        long pick = valueInHouse.get(ind) + houseRobber(valueInHouse, ind - 2);
        long nonpick = houseRobber(valueInHouse,ind-1);
        return Math.max(pick,nonpick);
    }
    static int  activity(int day, int last, int [][]points, int []dp){
        if(day==0){
            int maxi = 0;
            for(int i=0; i<=2; i++){
                if(i != last){
                    maxi = Math.max(maxi,points[0][i]);
                }
            }
            dp[day] = maxi;
        }
        if(dp[day] != -1){
            return dp[day];
        }
        int maxi = 0;
        for(int i=0; i<=2; i++){
            if(i!=last){
                int activity = points[day][i]+activity(day-1,i,points,dp);
                maxi = Math.max(maxi,activity);
            }
            dp[day] = maxi;
        }
        return maxi;
    }

}
