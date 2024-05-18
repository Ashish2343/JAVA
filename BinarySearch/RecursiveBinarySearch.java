package BinarySearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int [] nums = {1,4,6,23,100,432};
        System.out.println(BinarySearch(nums,0,nums.length-1,23));
    }
    private static int BinarySearch(int [] arr , int l , int h ,int k){
        if(l==h){
            if(arr[l]==k)   return l;
            else return -1;
        }else {
            int mid = l+(h-l)/2;
            if(k==arr[mid]) return mid;
            if(k<arr[mid])  return  BinarySearch(arr,l,mid-1,k);
            else return  BinarySearch(arr,mid+1,h,k);
        }

    }
}
