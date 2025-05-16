package DS_LAB;

public class Exp1 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(linearSearch(arr,3));
        System.out.println(BinarySearch(arr,4));
    }
    private static boolean linearSearch(int []arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    private static boolean BinarySearch(int []arr, int target){
        int l =0;
        int r = arr.length - 1;
        while (l<r){
            int mid = (l+r)/2;
            if(arr[mid]==target) return true;
            else if (arr[mid]>target) r = mid -1;
            else l = mid + 1;
        }
        return false;
    }

}
