package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack q =Reverse(st);
        System.out.println(q);
    }
    public static Stack Reverse(Stack <Integer> st){
        if(st.size() == 0 ){
            return st;
        }
        int k = st.pop();
        Reverse(st);
        InsertAtBase(st,k);
        return st;
    }
    public static Stack InsertAtBase(Stack<Integer>st, int val){
        if(st.size() == 0){
            st.push(val);
            return st ;
        }
        int x =st.pop();
        InsertAtBase(st,val);
        st.push(x);
        return st;
    }
}
