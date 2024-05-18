package RecursionProblems;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerofhanoi(3,'A','B','C');
    }
    static void towerofhanoi(int n, char src, char dest, char help){
        if(n== 0){
            return;
        }
        towerofhanoi(n-1,src,help,dest);
        System.out.println("MOVE FROM " + src + " TO " + dest);
        towerofhanoi(n-1,help,dest,src);
    }
}
