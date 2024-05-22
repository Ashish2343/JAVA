package DSA_Sheet;

public class LongestPalindrome {
    public static void main(String[] args) {
        String st = "rfkqyuqfjkxy";
        System.out.println(longestPalin(st));
    }
    static String longestPalin(String S){
        StringBuilder temp = new StringBuilder(S);
        temp.reverse();
        String result;
        for(int i=0; i<S.length(); i++){
            result = "";
            int j=0;
            while(i<temp.length() && temp.charAt(j)==S.charAt(i)){
                result = result + S.charAt(i);
                i++;
                j++;
            }if(i==temp.length()&&j>1){
                return result;
            }else{
                i = i-j;
            }
        }
        char t = S.charAt(0);
        return Character.toString(t);
    }
}
