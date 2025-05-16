package DS_LAB;

public class Exp2_B {
    public static void main(String[] args) {
        String [] arr1 = {"date"};
        String [] arr2 = {"frog"};
        replace(arr1,arr2);

    }
    private static void replace(String[] s1, String[] s2) {
        int minLength = Math.min(s1.length, s2.length);

        for (int i = 0; i < minLength; i++) {
            s1[i] = s2[i];
        }

        // Print the result after replacement
        print(s1);
    }

    private static void print(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
