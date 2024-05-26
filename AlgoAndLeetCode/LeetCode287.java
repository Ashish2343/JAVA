package AlgoAndLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode287 {
    public static void main(String[] args) {

    }
    static int findDuplicate(int[] nums) {
        int []k = new  int [nums.length];
         Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            int j = i+1;
            if(nums[i]==nums[j]) return nums[i];
            else continue;
        }
        return -1;
    }
    static int findDuplicate2(int[] nums) {
        HashSet st = new HashSet();
        for(int num :nums){
            if(st.contains(num)) return num;
            else st.add(num);
        }
       return -1;
    }
    static int findDuplicate3(int[] nums) {
        int slow = 0;
        int fast =0 ;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast != slow);

        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
