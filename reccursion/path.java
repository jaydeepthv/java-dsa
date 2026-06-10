import java.util.*;
class Main {
    
    static int countPath(int row , int col){
        if(row == 1 || col == 1){
            return 1;
        }
        
        int left = countPath(row -1, col);
        int right = countPath(row , col - 1);
        
        return left + right;
    }
    
    static ArrayList<String> path(int row , int col, String path){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> paths = new ArrayList<>();
        if(row > 0){
            paths.addAll(path(row -1, col, path +"D"));
        }
        if(col > 0){
          paths.addAll(path(row, col -1 , path + "R"));
        }
        
        return paths;
    }
    static ArrayList<String> pathDiagnol(int row , int col, String path){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> paths = new ArrayList<>();
        if(row > 0){
            paths.addAll(pathDiagnol(row -1, col, path +"D"));
        }
        if(col > 0){
          paths.addAll(pathDiagnol(row, col -1 , path + "R"));
        }
        if(col> 0 && row > 0){
            paths.addAll(pathDiagnol(row - 1, col - 1, path + "C"));
        }
        
        return paths;
    }
   
    
    public static void main(String[] args) {
        System.out.println(countPath(3,3));
        ArrayList<String> paths = new ArrayList<>();
        paths = pathDiagnol(3,3,"");
        
        System.out.println(paths);
    
    }
}
