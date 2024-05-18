package Recursion.BackTracking;

public class Maze {
    public static void main(String[] args) {
        int [][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        path("",3,3);
        System.out.println(count(3,3));
    }
    static int count(int rows, int cols){
        if(rows ==1 || cols == 1){
            return 1;
        }
       int left = count(rows-1,cols);
        int right = count(rows,cols-1);
        return left+right;
    }

    static void path(String p, int rows, int cols){
        if(rows==1 && cols==1){
            System.out.println(p);
        }
        if(rows >1){
            path(p+"D",rows-1,cols);
        }
        if(cols> 1){
            path(p+"R",rows,cols-1);
        }

    }
    static void Diagonal(String p, int rows, int cols){
        if(rows==1 && cols ==1){
            System.out.println(p);
        }
        if(rows >1){
            Diagonal(p+"D",rows-1,cols);
        }
        if(cols> 1){
            Diagonal(p+"R",rows,cols-1);
        }
        if(rows > 1 && cols >1){
            Diagonal(p+"x",rows-1,cols-1);
        }
    }
}
