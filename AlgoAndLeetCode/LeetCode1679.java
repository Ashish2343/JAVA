package AlgoAndLeetCode;

import java.util.Arrays;

public class LeetCode1679 {
    public static void main(String[] args) {
        int [] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        System.out.println(maxOperations(nums,2));
    }
    public static int maxOperations(int[] nums, int k) {
        nums = mergesort(nums);
        int count = 0;
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum > k){
                right--;
            } if (sum < k) {
                left++;
            } if (sum == k) {
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
    public static int[] mergesort(int [] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length /2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int [] first,int [] second){
        int [] mix = new int [first.length+ second.length];
        int i = 0;
        int j =0;
        int k =0;

        while (i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i<first.length){
            mix [k] = first[i];
            k++;
            i++;
        }
        while (j<second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }
}
