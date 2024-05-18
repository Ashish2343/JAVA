package Stacks;

import java.util.Stack;

public class BalanceBrackets {
    public static void main(String[] args) {
        String str = "()";
//        System.out.println(IsBalanced(str));
//        System.out.println(ToRemove(str));
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i <n ; i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(')');
            } else if(ch == '{'){
                st.push('}');
            } else if(ch == '['){
                st.push(']');
            } else{
                if(st.size()==0) return false;
                if(st.peek()== ch) st.pop();
                else return false;
            }

        }
        if(st.size()> 0){
            return false;
        } else{
            return true;
        }
    }
//    public static boolean IsBalanced(String str){
//        Stack<Character> st = new Stack<>();
//        int n = str.length();
//        for (int i = 0; i <n ; i++) {
//            char ch = str.charAt(i);
//            if(ch == '('){
//                st.push('(');
//            } else{
//               if(st.size()==0) return false;
//               if(st.peek()== '(') st.pop();
//            }
//        }
//        if(st.size()> 0){
//            return false;
//        } else{
//            return true;
//        }
//    }
//    public static int ToRemove(String str){
//        Stack<Character> st = new Stack<>();
//        int n = str.length();
//        for (int i = 0; i <n ; i++) {
//            char ch = str.charAt(i);
//            if(ch == '('){
//                st.push('(');
//            } else{
//                if(st.size()==0) return 0;
//                if(st.peek()== '(') st.pop();
//            }
//        }
//        if(st.size()> 0){
//            return st.size();
//        } else{
//            return 0;
//        }
//    }
}
