class Solution {
    public boolean table(char[][] board,int row,int col,char target){
        for(int i=0;i<9;i++){
            if(i==col){
                continue;
            }
            if(board[row][i]==target){
                return true;
            }
        }
        for(int i=0;i<9;i++){
            if(i==row){
                continue;
            }
            if(board[i][col]==target){
                return true;
            }
        }
        int rowNo=(row/3)*3;
        int colNo=(col/3)*3;
        for(int i=rowNo;i<rowNo+3;i++){
            for(int j=colNo;j<colNo+3;j++){
                if(i==row&&j==col){
                    continue;
                }
                if(board[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char tar=board[i][j];
                if(board[i][j]!='.'){
                    if(table(board,i,j,tar)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}