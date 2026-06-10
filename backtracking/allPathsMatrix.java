import java.util.*;
class Main {
  static void allPathMatrix(boolean maze[][], int row , int col, String path , int[][] p,int step){
      
      if(row == maze.length-1 && col == maze[0].length-1){
          p[row][col] = step;
          for(int[] n : p){
              System.out.println(Arrays.toString(n));
              
          }
          
          System.out.println(path);
          System.out.println();
          return;
      }
      
      if(!maze[row][col]){
      return;
      }
      
      maze[row][col] = false;
      p[row][col] = step;
      
      if(row < maze.length-1){
          allPaths(maze, row+1, col,path+"D" , p , step+1);
      }
      
      if(col < maze[0].length-1){
          allPaths(maze, row, col+1, path+"R", p , step+1 );
      }
      if(row > 0){
          allPaths(maze, row -1, col , path+"U", p , step+1);
      }
      if(col > 0){
          allPaths(maze , row , col-1, path+"L", p , step+1);
      }
      
       maze[row][col] = true;
       p[row][col] = 0;
      
  }
   
    public static void main(String[] args) {
       boolean[][] maze = {
            {true,  true,  true},
            {true,  true, true},
            {true,  true,  true}
        };
        int [][] arr =  {
            {0,  0,  0},
            {0,  0, 0},
            {0,  0,  0}
        };
        allPaths(maze , 0 , 0  , "",arr,1);
    
    
    }
}
