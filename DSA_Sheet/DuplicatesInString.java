package DSA_Sheet;

import java.util.HashMap;

public class DuplicatesInString {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String st = "geeksforgeeks";
        for(int i=0; i<st.length()-1; i++){
            if(map.containsKey(st.charAt(i))){
                map.put(st.charAt(i), map.get(st.charAt(i))+1);
            }else{
                map.put(st.charAt(i),1);
            }
        }
        System.out.println(map);
    }
}
