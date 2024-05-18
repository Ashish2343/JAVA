package RecursionProblems;

public class ReplaceString {
    public static void main(String[] args) {
        String s = "pipppi";
        Replace(s);
    }
    static void Replace(String  str){

        if(str.length() == 0){
            return;
        }
        if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            System.out.print("3.14");
            Replace(str.substring(2));
        } else{
            System.out.print(str.charAt(0));
            Replace(str.substring(1));
        }

    }
}
