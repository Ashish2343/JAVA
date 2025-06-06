package DS_LAB;

import java.util.Arrays;

public class Exp9_QuickSort {
    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8};
        int n = arr.length;
        System.out.println("Original Array "+ Arrays.toString(arr));
        quicksort(arr,0,n-1);
        System.out.print("Sorted Array " + Arrays.toString(arr));
    }
    public static void quicksort(int[]arr, int low, int high){
        if(low> high){
            return;
        }

        if(low<high){
            int pidx = partion(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
        }

    }
    public static int partion(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for (int j = low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot; // pivot = arr[high]
        arr[high] = temp;
        return i;
    }
}
