class Solution {

    static boolean isSafe(char[][] board, int row ,int col, char num){

        for(int i = 0; i< board.length; i++){
            if(board[row][i] == num && col != i){
                    return false;
            }
        }
        for(int i = 0; i< board.length; i++){
            if(board[i][col] == num && row != i){
                    return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;

        for(int i = startRow ; i < startRow + sqrt; i++){
            for(int j = startCol ; j< startCol + sqrt; j++){
                if((row != i || col != j) && board[i][j] == num ){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i< board.length; i++){
            for(int j = 0; j< board.length; j++){

                if(board[i][j] != '.'){

                if(!isSafe(board,i,j,board[i][j])){

                     return false;
                }

                }
            }
        }
    return true;
}
}
