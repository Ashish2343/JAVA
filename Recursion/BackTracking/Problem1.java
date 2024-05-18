package Recursion.BackTracking;
// A Maze is N*N binary matrix of blocks where the upper left block is known as th Source block,
// and the lower rightmost block is known as destination block. If we consider the maze, then maze[0][0]
// is the source, and maze[N-1][N-1] is the Destination. Our Main Task is to reach the destination from the source.
// We have Considered a rat as a character tha moves either forward or downwards or leftwards or upwards.
// In Maze there are few dead blocks denoted by 0 and active blocks denoted by 1. A rat can only move in active blocks.
public class Problem1 {
    public static void main(String[] args) {
            int rows = 3;
            int cols =4;
            int [][] maze = {
                    {1,0,1,1},
                    {1,1,1,1},
                    {1,1,0,1}
                            };
            boolean[][] isvisited =  new boolean[rows][cols];
            pathprint(0,0,rows-1,cols-1,"",maze,isvisited);
    } 
    public static void pathprint(int sr, int sc, int er, int ec, String s,int[][] maze, boolean[][] isvisited){

        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isvisited[sr][sc]== true) return;
        if(sr == er && sc== ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        isvisited[sr][sc]= true;
        pathprint(sr,sc+1,er,ec,s+"R",maze,isvisited);
        pathprint(sr+1,sc,er,ec,s+"D",maze,isvisited);
        pathprint(sr,sc-1,er,ec,s+"L",maze,isvisited);
        pathprint(sr-1,sc,er,ec,s+"T",maze,isvisited);
        //BackTracking
        isvisited[sr][sc] = false;
    }
}
