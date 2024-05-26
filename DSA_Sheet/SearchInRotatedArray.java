package DSA_Sheet;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr,2));
        int x,y,z;
        
    }
    static  public int search(int[] nums, int target) {
        int n = nums.length;

        int pivot_index = findPivot(nums,n);

        int idx = binarysearch(0, pivot_index-1, nums, target);
        if(idx != -1) return idx;
        idx = binarysearch(pivot_index,n-1,nums,target);
        return idx;

    }
    static int findPivot(int nums[], int n){
        int l=0, r=n-1;
        while(l<r){
            int mid = l +(r-l)/2;
            if(nums[mid]>nums[r]) l = mid+1;
            else r = mid;
        }
        return r;
    }
    static int binarysearch(int l, int r, int nums[], int target){
        int idx=-1;
        while(l<=r){
            int mid = l +(r-l)/2;

            if(nums[mid]== target){
                idx = mid;
                break;
            }else if(nums[mid]<target){
                l =mid+1;
            }else{
                r = mid-1;
            }
        }
        return idx;
    }
}
