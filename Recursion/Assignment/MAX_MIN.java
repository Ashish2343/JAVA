package Recursion.Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class MAX_MIN {
    public static void main(String[] args) {
        int [] arr = {2,4,3,-4,1};

        //ArrayList<Integer> ans = new ArrayList<>());
        System.out.println(Arrays.toString(MINMax(arr,0,-1,0)));
    }
    static int[] MINMax(int []arr, int index,int max,int min){

        if(arr.length == index){
            return new int[] {max,min};
        }

       max = Math.max(arr[index],max);
        min = Math.min(arr[index],min);
        return  MINMax(arr,index+1,max,min);

    }
 // TIME COMPLEXITY O(N)
}
