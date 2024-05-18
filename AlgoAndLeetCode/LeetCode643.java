package AlgoAndLeetCode;

public class LeetCode643 {
    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));

    }
    public  static double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int sum = 0;
        for (int i = 0; i < k ; i++) {
            sum = sum + nums[i];
        }
        int maxsum = sum;
        int end = k;
        while(end < nums.length){
            sum = sum + nums[end] - nums[start];
            end++;
            start++;
            maxsum = Math.max(sum,maxsum);
        }
        return (double)maxsum/k;

    }
}
