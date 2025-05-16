package DS_LAB;

import java.util.Stack;

public class Exp3_C {
    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "{{[[(())]]}}";

        System.out.println(test1 + ": " + checkBalancedParentheses(test1));
        System.out.println(test2 + ": " + checkBalancedParentheses(test2));
        System.out.println(test3 + ": " + checkBalancedParentheses(test3));
    }
    private static boolean checkBalancedParentheses(String s1) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s1.length(); i++) {
            char current = s1.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                st.push(current);
            } else if (current == '}' || current == ')' || current == ']') {
                if (st.isEmpty()) {
                    System.out.println("Not Balanced Parentheses");
                    return false;
                }
                char top = st.pop();
                if (!isMatchingPair(top, current)) {
                    System.out.println("Not Balanced Parentheses");
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("Balanced Parentheses");
            return true;
        } else {
            System.out.println("Not Balanced Parentheses");
            return false;
        }
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
                (open == '(' && close == ')') ||
                (open == '[' && close == ']');
    }

}