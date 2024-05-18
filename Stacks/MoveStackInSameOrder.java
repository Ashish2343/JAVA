package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            gt.push(x);
            st.pop();
        }
        System.out.println(gt);
        Stack<Integer> rt = new Stack<>();
        while(gt.size()>0){
            int k =gt.peek();
            rt.push(k);
            gt.pop();
        }
        System.out.println(rt);
    }
}
