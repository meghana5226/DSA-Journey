package PrefixSum.problems;

public class PrefixSum {
    // Leetcode 304 - Prefix sum for matrices

class NumMatrix {
    int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        prefix = new int[rows + 1][cols + 1];

        // Build prefix sum matrix
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefix[i][j] = matrix[i - 1][j - 1]
                             + prefix[i - 1][j]
                             + prefix[i][j - 1]
                             - prefix[i - 1][j - 1];
            }
        }
    }

    // Query submatrix sum from (row1,col1) to (row2,col2)
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix[row2 + 1][col2 + 1]
             - prefix[row1][col2 + 1]
             - prefix[row2 + 1][col1]
             + prefix[row1][col1];
    }
}

}
