package Extra;

public class find {
    public static void main(String[] args) {
        int[] numbers = {1,3,4,5,7,10,11};
        int target =9;
    }
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length;
        while(start>end){
            int complement = numbers[start] + numbers[end];
            if(complement== target){
                return new int[]{start+1 , end+1};
            } else if (complement > target) {
                end--;
            } else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
