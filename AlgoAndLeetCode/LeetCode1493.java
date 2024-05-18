package AlgoAndLeetCode;

public class LeetCode1493 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestOnes(nums));
    }
    public static int longestOnes(int[] nums) {
        int start = 0;
        int end = 0;
        int maxcount = 0;
        int zeroCount = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            maxcount = Math.max(maxcount, end - start + 1);
            end++;
        }

        return maxcount-1;
    }
}
