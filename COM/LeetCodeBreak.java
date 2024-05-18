package COM;

public class LeetCodeBreak {
    public static void main(String[] args) {
        int nums[] ={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        int k = nums.length;
        for(int i = 1; i<k; i++){
            if(nums[i] != nums[i-1]){
                //nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
