package RecursionProblems;

public class ReverseString {
    public static void main(String[] args) {

        String s = "jojo";
        reverse(s);

    }
    static void reverse(String str){

        if(str.length() == 0){
            return ;
        }
        String s = str.substring(1);
        reverse(s);
        System.out.print(str.charAt(0));
    }
}
