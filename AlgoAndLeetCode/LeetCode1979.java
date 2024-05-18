package AlgoAndLeetCode;

public class LeetCode1979 {
    public static void main(String[] args) {
        int[] nums = {10,6,9};
        Sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int x =findGCD(nums);
        System.out.println(x);

    }

    public static int findGCD(int[] nums) {
        int[] sort = new int[nums.length];
       sort =  Sort(nums);
       int x = sort[0];
       int y = sort[sort.length-1];
        return GCD(x, y);

    }

    public static int[] Sort(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int GCD(int a, int b) {
        int A = Math.max(a, b);
        int B = Math.min(a, b);
        if (B == 0) {
            return A;
        }
        return GCD(B, A % B);
    }
}

