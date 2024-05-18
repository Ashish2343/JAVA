package Stacks;

import java.util.Stack;

public class BasicStacks {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);    //  12
        st.push(22);    // 31
        st.push(31);    // 22
        st.push(12);    // 2

        // peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is " + st.size() );
    }
}
