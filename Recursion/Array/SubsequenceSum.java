package Recursion.Array;

import java.util.ArrayList;

public class SubsequenceSum {
    public static void main(String[] args) {
            int [] arr = {1,2,3};
            ArrayList <Integer> list = new ArrayList<>();
            subseq(arr,3,list,0,0);
       // subseq2(arr,3,list,0,0);
    }
    static void subseq(int []arr, int sum, ArrayList<Integer>list, int ind, int k){
        if(ind == arr.length){
            if(k==sum){
                System.out.println(list);

            }
            return;
        }
         list.add(arr[ind]);
         k = k + arr[ind];
        subseq(arr,sum,list,ind+1,k);
        list.remove(list.size()-1);
        k = k - arr[ind];
        subseq(arr,sum,list,ind+1,k);
    }
    static boolean subseq2(int []arr, int sum, ArrayList<Integer>list, int ind, int k){
        if(ind == arr.length){
            if(k==sum){
                System.out.println(list);
                return true;
            }
          else  return false;
        }
        list.add(arr[ind]);
        k = k + arr[ind];
       if(subseq2(arr,sum,list,ind+1,k)) return true;
        list.remove(list.size()-1);
        k = k - arr[ind];
        if(subseq2(arr,sum,list,ind+1,k)) return true;
        return false;
    }
}
