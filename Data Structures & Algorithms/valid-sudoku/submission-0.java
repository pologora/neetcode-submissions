class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String, HashSet> hashMap = new HashMap<>();
       

        for(int i = 0; i < 9; i++){
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            
            for(int j = 0; j < 9; j++){
                char chRow = board[i][j];
                char chCol = board[j][i];
                char chBox = board[i][j];

                String boxSetIndex = i/3 + "" + j/3;
                if(!hashMap.containsKey(boxSetIndex)){
                    hashMap.put(boxSetIndex, new HashSet<Character>());
                }

                HashSet boxSet = hashMap.get(boxSetIndex);

                if(rowSet.contains(chRow) || colSet.contains(chCol) || boxSet.contains(chBox)){
                    return false;
                }

                if(chRow != '.'){
                    rowSet.add(chRow);
                }

                if(chCol != '.'){
                    colSet.add(chCol);
                }

                if(chBox != '.'){
                    boxSet.add(chBox);
                }

            }
            
        }

        return true;
    }
}
