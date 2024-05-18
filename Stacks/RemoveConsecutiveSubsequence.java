package Stacks;

import java.util.Stack;

public class RemoveConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,4,4,2,2,5,5,7};
        int [] res = Remove(arr);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i] + " ");
        }

    }
    public static int[] Remove(int [] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length ; i++) {
            if(st.size()==0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
            else if( arr[i] == st.peek()){
                if(i== arr.length-1||arr[i] != arr[i+1]) st.pop();
            }
        }
        int[] res = new int[st.size()];
        for (int i = st.size()-1; i >=0 ; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
