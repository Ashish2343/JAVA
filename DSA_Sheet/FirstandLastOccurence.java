package DSA_Sheet;
import java.util.ArrayList;
import java.util.Collections;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int [] arr = { 7, 7, 9, 10, 10 };
        find(arr,5,6);
    }
   static ArrayList<Integer> find(int arr[], int n, int x)
    {
        int s = 0;
        int e = n-1;
        int index = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                index = mid;
                break;
            } else if (arr[mid] > x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(index==-1) {
            ans.add(-1);
            ans.add(-1);
            System.out.println(ans);
            return ans;
        }
        int i=0;
        int left = index;
        int right = index;
        while( left<n &&arr[index] == arr[left]){
            left++;
        }
        ans.add(0,left-1);
        while( right>=0 && arr[index] == arr[right-1]){
            right--;
        }
        ans.add(1,right);
        Collections.sort(ans);
        System.out.println(ans);
        return ans;
    }
}
