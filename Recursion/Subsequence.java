package Recursion;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        //subseq("",s);
        subseqASCII("",s);
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch , up.substring(1));
        subseq(p,up.substring(1));

    }
    static void subseqASCII(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqASCII(p + ch , up.substring(1));
        subseqASCII(p,up.substring(1));
        subseqASCII(p + (ch + 0), up.substring(1));

    }
}
