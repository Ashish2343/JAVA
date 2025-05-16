package DP;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(numberofwaystoclimbstairs(3 ));
    }
    static int numberofwaystoclimbstairs(int stairs){
        if(stairs == 0) return 1;
        if(stairs == 1) return 1;
        int left = numberofwaystoclimbstairs(stairs-1);
        int right = numberofwaystoclimbstairs(stairs-2);
        return left+right;
    }
}
