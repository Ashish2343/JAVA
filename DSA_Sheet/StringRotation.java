package DSA_Sheet;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksgeeksfor";
        System.out.println(CheckRotation(s1,s2));
    }
    public static boolean CheckRotation(String s1, String s2){
        String st = s1 + s1;

        int j=0;
        for(int i=0; i<st.length(); i++){
            if(s2.charAt(j)==st.charAt(i)){
                j++;
                if(j==s2.length()-1) return true;
            }else{
                j=0;
            }
        }

        return false;
    }
}
