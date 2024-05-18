package AlgoAndLeetCode;

public class LeetCode875 {
    public static void main(String[] args) {

    }
    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = findmax(piles);
        while(l<r){
            int mid  = l + (r-l)/2;
            if(canEatAll(piles,mid,h)){
                r  = mid;
            }else{
                l = mid+1;
            }
        }
        return l;

    }


    public static int findmax(int[]piles){
        int max = piles[0];
        for (int i = 1; i <piles.length ; i++) {
            if(max<piles[i]){
                max = piles[i];
            }
        }
        return max;
    }
    public static boolean canEatAll(int[]piles,int mid, int h){
        int actualhour = 0;
        for(int x:piles){
            actualhour  = actualhour + x/mid;
            if(x%mid!=0){
                actualhour++;
            }
        }
        return actualhour<=h;
    }
}
