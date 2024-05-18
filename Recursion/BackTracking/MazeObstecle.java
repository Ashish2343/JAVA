package Recursion.BackTracking;

public class MazeObstecle {
    public static void main(String[] args) {

            boolean [][] board = {
                    {true,true,true},
                    {true,false,true},
                    {true,true,true}
            };
            pathrestriction("",board,0,0);
    }
    static void pathrestriction(String p, boolean [] [] maze, int rows, int cols){
        if(rows == maze.length-1 && cols == maze[0].length-1 ){
            System.out.println(p);
            return;
        }
        if(!maze[rows][cols]){
            return;
        }

        if(rows < maze.length-1){
            pathrestriction(p+"D", maze,rows+1,cols);
        }
        if(cols < maze.length-1){
            pathrestriction(p+"R", maze,rows,cols+1);
        }

    }
}
