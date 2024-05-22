package AlgoAndLeetCode;

public class LeetCode38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n){
        if(n==1) return "1";
        else {
            String say = countAndSay(n - 1);

            String result = "";

            for (int i = 0; i < say.length(); i++) {
                char ch = say.charAt(i);
                int count = 1;
                while (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
                    count++;
                    i++;
                }
                result = result + Integer.toString(count) + Character.toString(ch);
            }
            return result;
        }
    }
}
