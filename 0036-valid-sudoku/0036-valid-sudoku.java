class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows=new boolean[9][9];
        boolean[][] cols=new boolean[9][9];
        boolean[][] boxnumber=new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int presNum=board[i][j]-'1';
                    int boxIdx=(i/3)*3+(j/3);
                    if(rows[i][presNum]||cols[j][presNum]||boxnumber[boxIdx][presNum]){
                        return false;
                    }
                    rows[i][presNum]=true;
                    cols[j][presNum]=true;
                    boxnumber[boxIdx][presNum]=true;
                }
            }
        }
        return true;
    }
}