class Solution {
    public  boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        int top = 0;
        int bottom = row - 1;

        while (top <= bottom) {

            int r = (top + bottom) / 2;

            if (target > matrix[r][column - 1]) {
                top = r + 1;
            } else if (target < matrix[r][0]) {
                bottom = r - 1;
            } else {
                // target is within this row
                for (int c = 0; c < column; c++) {
                    if (matrix[r][c] == target) {
                        return true;
                    }
                }
                return false;
            }
        }

        return false;
    }
}
