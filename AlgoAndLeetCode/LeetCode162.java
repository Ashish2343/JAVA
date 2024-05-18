package AlgoAndLeetCode;

public class LeetCode162 {
    public static void main(String[] args) {
            int [] nums = {1,2,7,3,1,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = (left + right)/2;
            if(nums[mid]<nums[mid+1]){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return right;
    }
}
