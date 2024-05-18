package RecursionProblems;

public class test {
    public static void main(String[] args) {
        String s = "axxbdxcefxhix";
        System.out.println(shift(s));


    }
    static String shift(String s) {
       if(s.length() == 0){
           return "";
       }
       char ch  = s.charAt(0);
       String ans = shift(s.substring(1));
       if(ch == 'x'){
           return  ans +  ch;
       }
       return ch + ans;
                }
        }
