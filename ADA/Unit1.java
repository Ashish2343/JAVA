package ADA;
import java.util.*;
public class Unit1 {
    public static void main(String[] args) {
        //System.out.println(pow(2,0));
       // System.out.println(pow(2,2));
        int [] arr ={3, 5, 8, 15, 19};
       // System.out.println(findMin(arr,0,5));
        //System.out.println(fibn(3));
//     System.out.println(TowerofHanoi(2,0,0,0));
//        System.out.println(lowerBound(arr,0,4,9,5));
        int m = 13, n = 20;
        System.out.println("Ackermann(" + m + ", " + n + ") is: " + ackermann(m, n));
    }
    public static int pow(int x, int n){ // n>=0
        if(n==0){
            return 1;
        }
        int xnm1 = pow(x,n-1);
        int xn = xnm1 * x;
        return xn;
    }
    public static int fastPow(int x, int n) { // n>=0
        if (n == 0) return 1;
        int half = fastPow(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * x;
    }
    public static int findMin(int[] A, int low, int high) {
        if (low == high) {
            return A[low];
        }
        int mid = (low + high) / 2;
        int min1 = findMin(A, low, mid);
        int min2 = findMin(A, mid + 1, high);
        return (min1 < min2 ? min1 : min2);
    }
    public static int fibn(int n){
        if (n <= 1) {
            return n;
        }
        return fibn(n-1)+fibn(n-2);
    }
    public static int TowerofHanoi(int n, int from, int to, int Aux){
        if(n==0) return 0;

        int count = 0;
        count = count + TowerofHanoi(n-1,from,Aux,to);
        count++;
        count = count + TowerofHanoi(n-1,Aux,to,from);
        return count;
    }
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    static int energy(int n, int heights[]){
        if(n==0){
            return 0;
        }
        int left = energy(n-1,heights) + Math.abs((heights[n]-heights[n-1]));
        int right = Integer.MAX_VALUE;
        if(n>1){
            right = energy(n-2,heights)+ Math.abs((heights[n]-heights[n-2]));
        }
        return Math.min(left,right);
    }
    public static List<Integer> solve(String s) {
        List<Integer> result = new ArrayList<>();

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is an operator
            if (c == '+' || c == '-' || c == '*') {
                // Recursively solve left and right substrings
                List<Integer> leftResults = solve(s.substring(0, i));
                List<Integer> rightResults = solve(s.substring(i + 1));

                // Combine the results from left and right parts
                for (int x : leftResults) {
                    for (int y : rightResults) {
                        if (c == '+') {
                            result.add(x + y);
                        } else if (c == '-') {
                            result.add(x - y);
                        } else {
                            result.add(x * y);
                        }
                    }
                }
            }
        }

        // If no operator is found, it means the string is a number
        if (result.isEmpty()) {
            result.add(Integer.parseInt(s));
        }

        return result;
    }
    static void subseq(int []arr, int sum, ArrayList<Integer>list, int ind, int k){
        if(ind == arr.length){
            if(k==sum){
                System.out.println(list);

            }
            return;
        }
        list.add(arr[ind]);
        k = k + arr[ind];
        subseq(arr,sum,list,ind+1,k);
        list.remove(list.size()-1);
        k = k - arr[ind];
        subseq(arr,sum,list,ind+1,k);
    }
    public static int lowerBound(int[] arr, int low, int high, int x, int ans) {
        if (low > high) {
            return ans;
        }

        int mid = (low + high) / 2;

        // If arr[mid] is greater than or equal to x, it could be the answer
        if (arr[mid] >= x) {
            ans = mid;
            return lowerBound(arr, low, mid - 1, x, ans); // Search in the left half
        } else {
            return lowerBound(arr, mid + 1, high, x, ans); // Search in the right half
        }
    }
    static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
