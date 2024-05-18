package AlgoAndLeetCode;

public class LeetCode1456 {
    public static void main(String[] args) {
  String s= "leetcode";
        System.out.println(maxVowels(s,3));
    }
    public  static int maxVowels(String s, int k) {
        char [] ch = s.toCharArray();
        int maxvowel = 0;
        int windowvowel = 0;
        for (int i = 0; i <k; i++) {
            if(vowel(ch[i])){
                windowvowel++;
            }
        }
        maxvowel =windowvowel;
        for (int i = k; i < ch.length; i++) {
            if(vowel(ch[i-k])){
                windowvowel--;
            }if(vowel(ch[i])){
                windowvowel++;
            }
            maxvowel =Math.max(maxvowel,windowvowel);
        }
        return maxvowel;
    }
    public static boolean vowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}
