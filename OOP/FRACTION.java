package OOP;

public class FRACTION {
    public static int gcd(int a , int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
    private static  class Fraction{
            int num;
            int den;

            public Fraction(int num, int den){
                this.num = num;
                this.den =den;
                simplify();
            }
            public void simplify(){
                int hcf = gcd(num,den);
                num /= hcf;
                den/= hcf;
            }

        }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(35,21);
        System.out.println(f1.num + "/" + f1.den);
    }
}
