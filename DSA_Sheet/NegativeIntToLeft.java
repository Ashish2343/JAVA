package DSA_Sheet;

import java.util.ArrayList;

public class NegativeIntToLeft {
    public static void main(String[] args) {
        int []arr = {-12,11,-13,-5,6,-7,5,-3,-6};
        ShiftLeft(arr);
        print(arr);
    }
    static int[] ShiftLeft(int [] arr){
        int j=0 , temp;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
    static void print(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
