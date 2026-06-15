
public class Main{
    
    public static void main(String args[]){
        boolean[][] board = {
            {false, false, false,false,false},
            {false, false, false,false,false},
            {false, false, false,false,false},
            {false, false, false,false,false},
            {false, false, false,false,false}
            
        };
        int x = nQueens(board,0);
        System.out.println(x);
        
    }
    
    static int nQueens(boolean board[][], int row){
        if(row == board.length){
             System.out.println("new board");
            display(board);
              System.out.println();
           
            return 1;
        }
        
        int count = 0;
        for(int col = 0; col < board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += nQueens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    
     static void display(boolean board[][]){
        
        for(boolean[] row: board){
            for(boolean val: row){
                if(val == true){
                    System.out.print("Q");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
           
        }
    }
    
    static boolean isSafe(boolean board[][], int row , int col){
        
        for(int i = 0; i< row; i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        for(int i = 1; i<= maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
              }
            }
        
        int maxRight = Math.min(board.length - col -1, row);
        
        for(int i = 1; i<= maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        
        return true;
        }
    }


