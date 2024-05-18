package AlgoAndLeetCode;

import java.util.Stack;

public class LeetCode151 {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(s);
        System.out.println(s.length());
        String t = reverseWords(s);
        System.out.println(t);
        System.out.println(t.length());
    }
    public static String reverseWords(String s) {
        String temp = "";
        String ans = "";
        Stack<String> st = new Stack<>();
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == ' '  ){
                if(temp.length() > 0){
                    st.push(temp);
                    temp = "";
                }}
                else{
                    temp = temp + s.charAt(i);
                }
        }
        ans = ans + temp;
        while(!st.isEmpty()){
            ans = ans + " " + st.pop();
        }
        if(ans.length() != 0 && ans.charAt(0) == ' '){
            ans = ans.substring(1);
        }
        return ans;
    }
}
