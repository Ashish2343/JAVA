package AlgoAndLeetCode;

public class LeetCode88 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        int [] numk = new int[m];
        for (int i = 0; i <m ; i++) {
            if(nums1[i] != 0){
                numk[i] = nums1[i];
            }else {
                break;
            }
        }
        disp(numk);
        int [] ans;
        ans = mergesort(numk,nums2);
        disp(ans);

    }
    public static int[] mergesort(int [] first,int [] second){
        int [] mix = new int [first.length+ second.length];
        int i = 0;
        int j =0;
        int k =0;

        while (i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i<first.length){
            mix [k] = first[i];
            k++;
            i++;
        }
        while (j<second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }
    public static void disp(int [] arr){
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
