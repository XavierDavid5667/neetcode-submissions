class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        HashSet<Character>[] rowSet=new HashSet[9];
        HashSet<Character>[] colSet=new HashSet[9];
        HashSet<Character>[] boxSet=new HashSet[9];

        for(int i=0;i<9;i++){
            rowSet[i]=new HashSet<>();
            colSet[i]=new HashSet<>();
            boxSet[i]=new HashSet<>();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                        if(board[i][j]=='.'){
                            continue;
                        }

                        int boxIndex = (i / 3) * 3 + (j / 3);

                if(rowSet[i].contains(board[i][j]) ||colSet[j].contains(board[i][j]) || boxSet[boxIndex].contains(board[i][j])){
                            return false;
                        }
                         rowSet[i].add(board[i][j]);
                colSet[j].add(board[i][j]);
                boxSet[boxIndex].add(board[i][j]);

                    }
                }
        return true;
        
    }
}
