package AlgoAndLeetCode;

import java.util.*;
import java.util.HashSet;

public class LeetCode1207 {
    public static void main(String[] args) {
        int [] arr  = {3,5,-2,-3,-6,-6};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int [] listOfValues = new int[map.size()];
        int index = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            listOfValues[index ++] = entry.getValue();
        }
        HashSet<Integer> set  = new HashSet<>();
        for(int i : listOfValues){
            if(set.contains(i)){
                return false;
            } else {
                set.add(i);
            }
        }
        return true;
    }
    public static void display(ArrayList arr){
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr);
        }
        System.out.println();
    }
    public static boolean uniqueOccurrences2(int[] arr) {
        int [] arr1 = new int[2001];
        for(int x : arr){
            arr1[x+1000]++;
        }
        Arrays.sort(arr1);
        for (int i = 0; i <2001 ; i++) {
            if(arr1[i]!=0 && arr1[i]==arr1[i-1]){
                return false;
            }
        }
        return true;
    }
}
