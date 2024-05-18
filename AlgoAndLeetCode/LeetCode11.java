package AlgoAndLeetCode;

public class LeetCode11 {
    public static void main(String[] args) {
        int [] area = {3,3,3};
        System.out.println(maxArea(area));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int base = right - left;
            int l = Math.min(height[left],height[right]);
            int area = base * l;
            max = Math.max(max,area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
    return max;
    }
}
