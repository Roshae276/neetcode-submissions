class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board.length; i++){
            HashSet<Character> seen = new HashSet<>();
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }else{
                    if(seen.contains(board[i][j])){
                        return false;
                    }
                    seen.add(board[i][j]);
                }
            }
         
        }
        for(int j = 0; j<board[0].length; j++){
            HashSet<Character> seen = new HashSet<>();
            for(int i=0; i<board.length; i++){
                if(board[i][j] == '.'){
                    continue;
                }else{
                    if(seen.contains(board[i][j])){
                        return false;
                    }
                    seen.add(board[i][j]);
                }
            }
           
        }
        for(int startRow = 0; startRow<9; startRow += 3){
            for(int startCol = 0; startCol<9; startCol +=3){
                HashSet<Character> seen = new HashSet<>();
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        if(board[startRow + i][startCol + j]=='.'){
                            continue;
                        }
                        else{
                            if(seen.contains(board[startRow + i][startCol + j])){
                                return false;
                            }
                            seen.add(board[startRow+i][startCol+j]);
                        }
                        
                    }
                }

            }
        }
        return true;
    }
}
