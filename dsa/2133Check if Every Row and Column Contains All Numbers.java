class Solution {
    public boolean checkValid(int[][] matrix) {

        for(int i = 0; i< matrix.length; i++){

                boolean[] row = new boolean[matrix.length +1];
                boolean[] col = new boolean[matrix.length +1];

            for(int j = 0; j< matrix.length; j++){
                
                int r = matrix[i][j];
                int c = matrix[j][i];

                if(row[r] || col[c]){
                    return false;
                }
                
                row[r] = true;
                col[c] = true;

            }


        }
        

        return true;
    }
}
