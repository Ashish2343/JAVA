package AlgoAndLeetCode;

public class LeetCode238 {
    public static void main(String[] args) {
        int [] nums = {2,1,3,4};
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        print(ans);
    }
    public static int mul(int[] arr){
        int mul = 1;
        for (int i = 0; i <arr.length ; i++) {
            mul = mul * arr[i] ;
        }
        return mul;
    }
    public static  void print(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
