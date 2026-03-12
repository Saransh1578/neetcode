// Valid Sudoku (Problem Number 36)

class Solution {
    public boolean isValidSudoku(char[][] board) {
       boolean [][] r=new boolean [9][9];
       boolean [][] c=new boolean [9][9];
       boolean [][] box=new boolean [9][9];

       for(int i=0;i<9;i++)
       {
        for(int j=0;j<9;j++)
        {
            if(board[i][j]!='.'){
                int num=board[i][j]-'1';
                int boxIdx=(i/3)*3+(j/3);

                if(r[i][num] || c[j][num] || box[boxIdx][num])return false;

                r[i][num]=c[j][num]=box[boxIdx][num]=true;
            }

        }
       } 
       return true;
    }
}