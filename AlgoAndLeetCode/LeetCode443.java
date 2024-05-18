package AlgoAndLeetCode;

public class LeetCode443 {
    public static void main(String[] args) {
        char [] chars = {'a','a','a','b','b','b','c','c'};
        compress(chars);
    }
    public static int compress(char[] chars){
        int i =0;
        int indx = 0;
        int n = chars.length;
        while(i<n){
            char char_curr = chars[i];
            int count = 0;

            while(i<n && chars[i]==char_curr){
                count++;
                i++;
            }
            chars[indx] = char_curr;
            indx++;
            if(count >1){
                String cnt_string = Integer.toString(count);
                for(int k=0; k<cnt_string.length();k++){
                    chars[indx] = cnt_string.charAt(k);
                    indx++;
                }
            }

        }
        return indx;

    }
}
