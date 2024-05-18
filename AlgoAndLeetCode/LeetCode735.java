package AlgoAndLeetCode;
import java.util.Stack;
public class LeetCode735 {
    public static void main(String[] args) {

    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st1 = new Stack<>();
      for(int i : asteroids){
          while (!st1.isEmpty() && i<0 && st1.peek()>0){
              int sum = i + st1.peek();
              if(sum <0){
                  st1.pop();
              } else if (sum >0) {
                  i = 0;
              }else{
                  st1.pop();
                  i =0;
              }
          }
          if(i != 0){
              st1.push(i);
          }
      }
        int n = st1.size();
      int [] arr = new int[n];
      int i =n-1;
        while(!st1.isEmpty()){
            arr[i] = st1.pop();
            i--;
        }
        return arr;
    }
}
