package AlgoAndLeetCode;
// Euclid's Algorithm
public class GCD {
    public static void main(String[] args) {
        int x = GCD(12,33);
        System.out.println(x);
    }
    public static int GCD(int a, int b){
        int A = Math.max(a,b);
        int B = Math.min(a,b);
        if( B == 0){
            return A;
        }
            return GCD(B,A%B);
    }
}
