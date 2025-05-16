package DS_LAB;
import java.util.Stack;
public class Exp3_B {
   public static class InfixToPostfixEvaluator {
        private int precedence(char ch) {
            switch (ch) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '^':
                    return 3;
            }
            return -1;
        }
        public String infixToPostfix(String expression) {
            StringBuilder result = new StringBuilder();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                // If the character is an operand, add it to the result
                if (Character.isLetterOrDigit(c)) {
                    result.append(c);
                }
                // If the character is '(', push it to the stack
                else if (c == '(') {
                    stack.push(c);
                }
                // If the character is ')', pop and output from the stack
                // until an '(' is encountered
                else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        result.append(stack.pop());
                    }
                    if (!stack.isEmpty() && stack.peek() != '(') {
                        return "Invalid Expression"; // Invalid expression
                    } else {
                        stack.pop();
                    }
                } else { // An operator is encountered
                    while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                        if (stack.peek() == '(') {
                            return "Invalid Expression";
                        }
                        result.append(stack.pop());
                    }
                    stack.push(c);
                }
            }

            // Pop all the operators from the stack
            while (!stack.isEmpty()) {
                if (stack.peek() == '(') {
                    return "Invalid Expression";
                }
                result.append(stack.pop());
            }

            return result.toString();
        }

        // Method to evaluate a postfix expression
        public int evaluatePostfix(String expression) {
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                // If the character is an operand, push it to the stack
                if (Character.isDigit(c)) {
                    stack.push(c - '0');
                } else { // An operator is encountered
                    int val1 = stack.pop();
                    int val2 = stack.pop();

                    switch (c) {
                        case '+':
                            stack.push(val2 + val1);
                            break;
                        case '-':
                            stack.push(val2 - val1);
                            break;
                        case '*':
                            stack.push(val2 * val1);
                            break;
                        case '/':
                            stack.push(val2 / val1);
                            break;
                    }
                }
            }
            return stack.pop();
        }

    }
    public static void main(String[] args) {
        InfixToPostfixEvaluator evaluator = new InfixToPostfixEvaluator();

        String infixExpression = "3+(2*4)-5";
        String postfixExpression = evaluator.infixToPostfix(infixExpression);

        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Evaluation Result: " + evaluator.evaluatePostfix(postfixExpression));
    }
}

