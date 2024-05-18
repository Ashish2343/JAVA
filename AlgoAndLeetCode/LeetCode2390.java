package AlgoAndLeetCode;

import java.util.Stack;

public class LeetCode2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
//        Stack st1 = new Stack<>();
////        System.out.println(removeStars(s));
//        for (int i = s.length()-1; i > -1; i--) {
//            char ch =s.charAt(i);
//            st1.push(ch);
//        }
        System.out.println(removeStars(s));
        removeStars(s);
//        display(st1);

    }
    public static String removeStars(String s) {
        Stack st1 = new Stack<>();
        Stack st2 = new Stack<>();
        for (int i = s.length()-1; i > -1; i--) {
            char ch =s.charAt(i);
            st1.push(ch);
        }
        int i = 0;
        while (!st1.isEmpty()){
            char c = s.charAt(i);
            if(c == '*'){
                st1.pop();
                st2.pop();
            }else{
                st2.push(st1.peek());
                st1.pop();
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();
        for(Object element : st1){
            ans.append(element);
        }
        ans = ans.reverse();
        return ans.toString();
//        return "w";
    }
    public static void display(Stack st){
        while (!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
