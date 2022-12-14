class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0,c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}

/*Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true */
