class Solution {
    public boolean isValidSudoku(char[][] arr) {
        for(int a =0 ;a<9;a++){
            for(int b= 0 ;b<9;b++){
                if(Character.isDigit(arr[a][b])){
                    if(!check(arr,a,b))
                        return false;
                }     
            }
        }
        return true;
    }
    
    public boolean check(char[][] arr , int a, int b) {
        char val = arr[a][b];
        for(int i = 0 ; i < 9 ;i++){
            if(i == b) continue;
            if(arr[a][i] == val) return false;
        }
        for(int i = 0 ; i < 9 ;i++){
            if(i == a) continue;
            if(arr[i][b] == val) return false;
        }
        int blr = a/3;
        int blc = b/3;
        
        for(int i = blr *3; i<( blr *3) +3 ; i ++){
            
              for(int j = blc*3;j < (blc*3)+3 ;j++){
                  
                  if(i == a && j == b) continue;
                  if(arr[i][j] == val) return false;
              }
        }
        return true;
    }
}
