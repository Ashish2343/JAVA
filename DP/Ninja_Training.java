package DP;

import java.util.Arrays;

public class Ninja_Training {
    public static void main(String[] args) {
        int [][]points = {{10,50,1},{5,100,11}};
//        System.out.println(actvity(1,3,points));
        int [] dp = new int[points.length];
        Arrays.fill(dp,-1);
        System.out.println(actvity(1,3,points,dp));

    }
    static int  actvity(int day, int last, int [][]points){
        if(day==0){
            int maxi = 0;
            for(int i=0; i<=2; i++){
                if(i != last){
                    maxi = Math.max(maxi,points[0][i]);
                }
            }
            return maxi;
        }

       int maxi = 0;
        for(int i=0; i<=2; i++){
            if(i!=last){
                int activity = points[day][i]+actvity(day-1,i,points);
                maxi = Math.max(maxi,activity);
            }
        }
        return maxi;
    }
    static int  actvity(int day, int last, int [][]points, int []dp){
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
                int activity = points[day][i]+actvity(day-1,i,points);
                maxi = Math.max(maxi,activity);
            }
            dp[day] = maxi;
        }
        return maxi;
    }
}
