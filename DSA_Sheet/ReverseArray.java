package DSA_Sheet;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        print(arr);
        Reverse(arr);
        print(arr);

    }
   public static int []Reverse(int [] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
        return arr;
    }
    public static void print(int arr[]){
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
