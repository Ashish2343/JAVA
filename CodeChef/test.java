
package CodeChef;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
           String a = sc.next();
           String b = sc.next();
           int count0 = 0;
           int count1 =0;
           for(int i=0; i<a.length(); i++){
               if(a.charAt(i)=='0'){count0++;}
               else count1++;
           }
            for(int i=0; i<a.length(); i++){
                if(b.charAt(i)=='0'){count0++;}
                else count1++;
            }
            if(count0==count1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
