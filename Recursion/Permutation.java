package Recursion;

public class Permutation {
    public static void main(String[] args) {
            permuatation("", "ABC");
    }
    static void permuatation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=2 ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permuatation(f+ch+s, up.substring(1));
        }
    }
}
