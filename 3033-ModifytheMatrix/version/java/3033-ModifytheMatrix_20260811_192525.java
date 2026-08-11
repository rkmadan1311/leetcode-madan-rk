// Last updated: 11/08/2026, 19:25:25
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5
6        // Find the maximum value in each column
7        for (int col = 0; col < cols; col++) {
8            int max = 0;
9
10            for (int row = 0; row < rows; row++) {
11                max = Math.max(max, matrix[row][col]);
12            }
13
14            // Replace -1 with column maximum
15            for (int row = 0; row < rows; row++) {
16                if (matrix[row][col] == -1) {
17                    matrix[row][col] = max;
18                }
19            }
20        }
21
22        return matrix;
23    }
24}