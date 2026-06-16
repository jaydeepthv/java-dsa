class Solution {

    static void nQueens(boolean[][] board,
                        List<List<String>> queenPlacement,
                        int row) {

        if (row == board.length) {
            queenPlacement.add(buildBoard(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;       
                nQueens(board, queenPlacement, row + 1);
                board[row][col] = false;      // backtrack
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
     
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

       
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

      
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    static List<String> buildBoard(boolean[][] board) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();

            for (int j = 0; j < board.length; j++) {
                row.append(board[i][j] ? 'Q' : '.');
            }

            ans.add(row.toString());
        }

        return ans;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> queenPlacement = new ArrayList<>();
        boolean[][] board = new boolean[n][n];

        nQueens(board, queenPlacement, 0);

        return queenPlacement;
    }
}
