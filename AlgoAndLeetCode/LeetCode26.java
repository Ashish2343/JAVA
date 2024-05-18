package AlgoAndLeetCode;

import java.util.Stack;

public class LeetCode26 {
    public static void main(String[] args) {
        int [] nums = {};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack();
        for (int i = 0; i <nums.length ; i++) {
            st1.push(nums[i]);
        }
        while (!st1.isEmpty()){
            if (st1.size() ==1) {
                st2.push(st1.pop());
                break;
            }
            int x = st1.pop();
            if(x != st1.peek()){
                st2.push(x);
            }
        }
        int i =0;
        int size = st2.size();
        while (!st2.isEmpty()){
            nums[i] = st2.pop();
            i++;
        }
        return size;
    }
}
