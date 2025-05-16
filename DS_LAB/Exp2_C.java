package DS_LAB;

public class Exp2_C {
    public static void main(String[] args) {
        String [] arr1 = {"hello"};
        String [] arr2 = {"world"};
        Concatinaate(arr1,arr2);
    }
    private static String[] Concatinaate(String []s1, String[]s2){

        String [] s3 = new String[s1.length + s2.length];
        for (int i = 0; i <s1.length ; i++) {
            s3[i] = s1[i];
        }
        int j=s1.length;
        for (int i = 0; i <s2.length ; i++) {
            s3[j] = s2[i];
            j++;
        }
        print(s3);
        return s3;
    }
    private static void print(String [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
