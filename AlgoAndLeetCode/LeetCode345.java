package AlgoAndLeetCode;

public class LeetCode345 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseVowels(str));

    }
    public static String reverseVowels(String s) {
        for(int i =0; i< s.length(); i++){
            for(int j= s.length()-1; j>0; j--){
                char ch1;
                char ch2;
                if(s.charAt(i)=='a'|| s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u' || s.charAt(i)=='U'&& s.charAt(j)=='a'|| s.charAt(j)=='A'||s.charAt(j)=='e'||s.charAt(j)=='E'||s.charAt(j)=='i'||s.charAt(j)=='I'||s.charAt(j)=='o'||s.charAt(j)=='O'||s.charAt(j)=='u' || s.charAt(j)=='U' ){
                    ch1 = s.charAt(i);
                    ch2 = s.charAt(j);
                    swap(ch1,ch2);
                }

            }
        }
        return s;
    }
    public static void swap(char c1, char c2){
        char temp =c1;
        c1= c2;
        c2 = temp;
    }
}
