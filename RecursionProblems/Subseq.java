package RecursionProblems;

public class Subseq {
    public static void main(String[] args) {
        String s = "ABC";
        subseq("",s);
    }
    // up = original string 'ABC'
    static  void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));   // Either add string or ignore it
        subseq(p,up.substring(1));
    }
}
