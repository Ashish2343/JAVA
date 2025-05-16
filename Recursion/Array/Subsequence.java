package Recursion.Array;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        int [] arr = {3,1,2};
        ArrayList <Integer> list = new ArrayList<>();
        subseq(0,list,arr);
    }
    static void subseq(int ind, ArrayList <Integer> list, int [] arr){
        if(ind == arr.length){
                System.out.println(list);
            return;
        }
        // take or pick particular index in subsequence
        list.add(arr[ind]);
        subseq(ind+1,list,arr);
        list.remove(list.size()-1);
        subseq(ind+1,list,arr);
    }
}
