class Solution {
    static boolean isSafe(char[][] board, int row, int col, char num){
        for(int i = 0; i<board.length; i++){
            if(board[row][i] == num ){
                return false;
            }
        }

         for(int i = 0; i<board.length; i++){
            if(board[i][col] == num ){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;
        for(int i = startRow; i < startRow + 3; i++){
            for(int j = startCol; j < startCol + 3; j++){
                if(board[i][j] == num){
                        return false;
                }
            }
        }

        return true;
    }

    static boolean solve(char[][] board){
         for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){

                if(board[i][j] == '.'){
                    for(char num  = '1'; num <= '9'; num++){
                            if(isSafe(board,i,j,num)){


                                board[i][j] = num;
                               

                           if(solve(board)){
                            return true;
                           }

                            board[i][j] = '.';

                    }
                  
            }
              return false;
        }
        
         }
      }
      return true;
    }

    public void solveSudoku(char[][] board) {

       solve(board);
        
    }
}
    
