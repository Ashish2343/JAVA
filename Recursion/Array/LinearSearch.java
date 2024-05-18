package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
       // System.out.println(search(arr,4,0));
         ArrayList<Integer> ans = searchlist(arr,3,0,new ArrayList<>());
        System.out.println(ans);
    }
    static boolean search(int [] arr, int n, int index){
        if( index == arr.length){
            return false;
        }

        return arr[index] == n || search(arr,n,index+1);
    }
    static ArrayList searchlist(int [] arr, int n, int index,ArrayList<Integer>list){
        if( index == arr.length){
            return list;
        }
        if(arr[index] == n){
            list.add(index);
        }
       return searchlist(arr,n,index+1,list);
    }

    static ArrayList<Integer> searchlist2(int[]arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
           list.add(index);
        }

        ArrayList<Integer> AnsBeforeCalls = searchlist2(arr,target,index+1);

        list.addAll(AnsBeforeCalls);

        return list;
    }
}
