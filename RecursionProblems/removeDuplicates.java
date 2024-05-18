package RecursionProblems;

public class removeDuplicates {
    public static void main(String[] args) {
            String s = "aaaabbbcdd";
        System.out.println(Remove(s));

    }
    static String Remove(String s){
         if(s.length() <= 1){
             return s;
         }
        char ch = s.charAt(0);
         String ans = Remove(s.substring(1));
         if(ch == ans.charAt(0)){
            return ans;
         }
         return ch+ans;
    }
}
