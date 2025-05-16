package DS_LAB;

public class Exp2_A {
    public static void main(String[] args) {
      String [] arr = {"h","e","l","l","o"," ","w","o","r","l","d"};
      SubSting(arr,0,5);
    }
    private static void SubSting(String []arr, int S, int E){
        String [] New = new String[E-S+1];
        int i=0;
        while (S<=E){
            New[i++] = arr[S++];
        }
        print(New);
    }
    private static int FindPosition(String []arr, String Pos){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==Pos) return i;
        }
        return -1;
    }

    private static void print(String [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


