package DP;

import java.util.ArrayList;

public class HouseRobber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(6);
       System.out.println(RobHouse(arr,5));
    }
    static long houseRobber(ArrayList<Integer>valueInHouse, int ind){
        if(ind==0) return valueInHouse.get(0);
        if(ind<0) return 0;
        long pick = valueInHouse.get(ind) + houseRobber(valueInHouse, ind - 2);
        long nonpick = houseRobber(valueInHouse,ind-1);
        return Math.max(pick,nonpick);
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
}