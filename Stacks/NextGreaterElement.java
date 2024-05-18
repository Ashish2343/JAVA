package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr = {1,3,2,1,8,6,3,4};
        int [] res = NextGreater(arr);
        for (int i = 0; i < res.length ; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int [] res2 = NextGreaterFront(arr);
        for (int i = 0; i < res.length ; i++) {
            System.out.print(res2[i] + " ");
        }
        System.out.println();
    }
    public static int[] NextGreater(int[] arr){
        int n = arr.length;
        int [] res = new int[n];
        res[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for (int i = n-2; i >=0 ; i--) {
            while( st.size() > 0 && st.peek() < arr[i]  ){
                st.pop();
            }
          if(st.size() == 0){
              res[i] =-1;
          } else {
              res[i] = st.peek();

          }
          st.push(arr[i]);
        }
        return res;
    }
    public static int[] NextGreaterFront(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i <=n-1; i++) {
            while(st.size()>0 && arr[i] > arr[st.peek()]){
                for (int j = 1; j <=i ; j++) {
                    res[i-j] = arr[i];
                }
                st.pop();
            }
            st.push(i);
        }
        for (int i = 0; i <=n-1 ; i++) {
            if(res[i] ==0){
                res[i] =-1;
            }
        }
        return res;
    } 
}
