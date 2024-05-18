package Extra;

public class Factor {
    public static void main(String[] args) {
        int n =20;
        factor(n);
    }
//    private static void factor(int n){
//// (O)N
//        for (int i = 1; i <=n ; i++) {
//            if(n%i ==0){
//                System.out.println(i);
//                n =n/i;
//                i=2;
//            }
//        }
//    }
    private static void factor(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i ==0){
                if(n%i == i){
                    System.out.println(i);
                } else{
                    System.out.println(i + " "+ n/i);
                }
            }
        }
    }
}
