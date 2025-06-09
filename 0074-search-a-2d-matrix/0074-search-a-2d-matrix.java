class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (target < matrix[0][0] || target > matrix[row - 1][col - 1])
            return false;

        int i;
        for (i = 0; i < row; i++) {
            if (target <= matrix[i][col - 1]) {
                break;
            }
        }

        for (int j = 0; j < col; j++) {
            if (matrix[i][j] == target) {
                return true;
            }
        }

        return false;


    }
}