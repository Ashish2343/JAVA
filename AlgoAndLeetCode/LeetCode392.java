package AlgoAndLeetCode;

public class LeetCode392 {
    public static void main(String[] args) {
        String s = "b", t = "c";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {

        int m = 0;
        int n = 0;
        while(m<s.length() && n<t.length()){
            if(s.charAt(m)== t.charAt(n)){
                m++;
            }
            n++;
        }
        return m==s.length();
    }
}
