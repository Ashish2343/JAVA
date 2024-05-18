package AlgoAndLeetCode;

import java.util.HashMap;

public class LeetCode2352 {
    public static void main(String[] args) {

    }
    public static int compare(int[][]grid,int[]arr){
        boolean flag = true;
        int k = 0;
        int ans = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                if(arr[k++] != grid [row][col] ){
                        break;
                } else {
                    ans ++;
                }
            }
            k=0;
        }
        return  ans;
    }
    static int compare(int[][] grid, int[] ar,int n){
        boolean flag = true;
        int k=0;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ar[k++] != grid[j][i]){
                    flag = false;
                    break;
                }
            }
            if(flag) ans++;
            else flag = true;
            k=0;
        }
        return ans;
    }
    public  static int equalPairs(int[][] grid) {
       int ans = 0;
        for (int row = 0; row < grid.length ; row++) {
            for (int col = 0;  col<grid.length ; col++) {
                        boolean flag = true;
                for (int k = 0;  k<grid.length ; k++) {
                    if(grid[row][k] != grid [k][col]){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    ans++;
                }
            }
        }
        return ans;
    }
//    public  static int equalPairs2(int[][] grid) {
//        HashMap<String ,Integer> map = new HashMap<>();
//        for (int i = 0; i <grid.length ; i++) {
//            String rowstr =   arrayToString(grid[i]);
//            map.put(rowstr,map.getOrDefault())
//        }
//    }
    public static String arrayToString(int[]arr){
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num);
        }
        return sb.toString();
    }
}
