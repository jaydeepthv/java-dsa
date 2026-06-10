import java.util.*;
class Main {
   static ArrayList<String> countPathWithObst(boolean maze[][], int row ,int col ,String path){
       if(row == maze.length - 1  && col == maze[0].length - 1){
          ArrayList<String> list = new ArrayList<>();
          list.add(path);
          return list;
       }
       if(!maze[row][col]){
           return new ArrayList<>();
       }
        ArrayList<String> paths = new ArrayList<>();
       if(row < maze.length - 1 ){
         paths.addAll(countPathWithObst(maze ,row + 1, col,path+"D"));
       }
        if(col < maze[0].length - 1 ){
         paths.addAll(countPathWithObst(maze ,row , col+1 , path+"R"));
       }
        if(col < maze[0].length - 1 && row < maze.length - 1 ){
         paths.addAll(countPathWithObst(maze ,row+1 , col+1 , path+"C"));
       }
       
       return paths;
          }
    
    public static void main(String[] args) {
       boolean[][] maze = {
    {true,  true,  true,  true},
    {true,  true, true,  true},
    {true,  true,  true, false},
    {true,  true,  true,  true}
};
     ArrayList<String> paths = new ArrayList<>(); 
     paths = countPathWithObst(maze,0,0,"");
     System.out.println(paths);
    
    }
}
