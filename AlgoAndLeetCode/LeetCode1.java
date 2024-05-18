package AlgoAndLeetCode;

import java.util.HashMap;

public class LeetCode1 {
    public static void main(String[] args) {
            int [] arr =   {3,2,4};
            int [] ans = sum(arr,6);

    }
    public static int[] sum(int [] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
