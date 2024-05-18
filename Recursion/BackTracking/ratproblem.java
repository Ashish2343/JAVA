package Recursion.BackTracking;

public class ratproblem {
    public static void main(String[] args) {
        int rows = 3;
        int cols =3;
        boolean [][] isvisited = new boolean[rows][cols];
        pathprint(0,0,rows-1,cols-1,"",isvisited);
    }
    public static void pathprint(int sr, int sc, int er, int ec, String s, boolean[][] isvisited){

        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isvisited[sr][sc]== true) return;
        if(sr == er && sc== ec){
            System.out.println(s);
            return;
        }
        isvisited[sr][sc]= true;
        pathprint(sr,sc+1,er,ec,s+"R",isvisited);
        pathprint(sr+1,sc,er,ec,s+"D",isvisited);
        pathprint(sr,sc-1,er,ec,s+"L",isvisited);
        pathprint(sr-1,sc,er,ec,s+"T",isvisited);
        //BackTracking
        isvisited[sr][sc] = false;
    }
}
