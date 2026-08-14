class Solution {
    public void printNQueens(int[][]chess , List<List<String>>qsf , int row){
        if(row == chess.length){
            List<String>board = new ArrayList<>();
            for(int i=0; i<chess.length; i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<chess.length; j++){
                    if(chess[i][j] == 1){
                        sb.append("Q");
                    }else{
                        sb.append(".");
                    }
                }
                board.add(sb.toString());
            }
            qsf.add(board);
            return;
        }
        for(int col = 0; col<chess.length; col++){
            if(isSafe(chess,row,col)){
                chess[row][col] = 1;
                printNQueens(chess,qsf,row+1);
                chess[row][col] = 0;
            }
        }
    }
    public boolean isSafe(int[][]chess , int row , int col){
        for(int i=row-1,j=col; i>=0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j-- ){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<chess.length; i--,j++){
            if(chess[i][j] == 1){
                return false;
            }
        }

        return true;

    }
    public List<List<String>> solveNQueens(int n) {
        int[][]chess = new int[n][n];
        List<List<String>> ans = new ArrayList<>();
        printNQueens(chess,ans,0);
        return ans;
    }
}
