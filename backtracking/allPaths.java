import java.util.*;
class Main {
  static void allPaths(boolean maze[][], int row , int col, String path){
      
      if(row == maze.length-1 && col == maze[0].length-1){
          System.out.println(path);
          return;
      }
      
      if(!maze[row][col]){
      return;
      }
      
      maze[row][col] = false;
      
      if(row < maze.length-1){
          allPaths(maze, row+1, col,path+"D" );
      }
      
      if(col < maze[0].length-1){
          allPaths(maze, row, col+1, path+"R" );
      }
      if(row > 0){
          allPaths(maze, row -1, col , path+"U");
      }
      if(col > 0){
          allPaths(maze , row , col-1, path+"L");
      }
      
       maze[row][col] = true;
      
  }
   
    public static void main(String[] args) {
       boolean[][] maze = {
            {true,  true,  true},
            {true,  true, true},
            {true,  true,  true}
        };
        
        allPaths(maze , 0 , 0  , "");
    
    
    }
}
