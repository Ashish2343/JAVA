package AlgoAndLeetCode;

public class LeetCode605 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,1};
        System.out.println(canPlaceFlowers(arr,2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int cout =0;
        for(int i =0; i<flowerbed.length; i++){
            if(flowerbed[i]==0 && (i==0 ||flowerbed[i-1]==0) &&(i==flowerbed.length-1||flowerbed[i+1]==0) ){
                cout++;

                if(cout == n){
                    return true;
                }

            }
        }

        return false;
    }
}
