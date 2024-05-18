package Recursion.Assignment;

public class UPPERCASE {
    public static void main(String[] args) {
       String  st = "Hello";
       char ch ='\0';

        System.out.println(Uppercase(st,0,ch));


    }
    static char Uppercase(String str,int i, char ch){

        if(str.charAt(i) == '\0'){
            return 0;
        } if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }

        if(Character.isUpperCase(str.charAt(i))){
            ch = str.charAt(i);
        }

        return Uppercase(str,i+1,ch);
    }
}
