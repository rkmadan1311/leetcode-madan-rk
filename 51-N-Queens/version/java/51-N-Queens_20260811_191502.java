// Last updated: 11/08/2026, 19:15:02
1import java.util.*;
2
3class Solution {
4    public List<List<String>> solveNQueens(int n) {
5        List<List<String>> result = new ArrayList<>();
6
7        char[][] board = new char[n][n];
8
9        for (char[] row : board) {
10            Arrays.fill(row, '.');
11        }
12
13        backtrack(0, n, board, result);
14
15        return result;
16    }
17
18    private void backtrack(int row, int n, char[][] board,
19                           List<List<String>> result) {
20
21        if (row == n) {
22            List<String> solution = new ArrayList<>();
23
24            for (char[] r : board) {
25                solution.add(new String(r));
26            }
27
28            result.add(solution);
29            return;
30        }
31
32        for (int col = 0; col < n; col++) {
33
34            if (isSafe(row, col, n, board)) {
35                board[row][col] = 'Q';
36
37                backtrack(row + 1, n, board, result);
38
39                board[row][col] = '.';
40            }
41        }
42    }
43
44    private boolean isSafe(int row, int col, int n, char[][] board) {
45
46        // Check column
47        for (int i = 0; i < row; i++) {
48            if (board[i][col] == 'Q') {
49                return false;
50            }
51        }
52
53        // Check upper-left diagonal
54        for (int i = row - 1, j = col - 1;
55             i >= 0 && j >= 0; i--, j--) {
56
57            if (board[i][j] == 'Q') {
58                return false;
59            }
60        }
61
62        // Check upper-right diagonal
63        for (int i = row - 1, j = col + 1;
64             i >= 0 && j < n; i--, j++) {
65
66            if (board[i][j] == 'Q') {
67                return false;
68            }
69        }
70
71        return true;
72    }
73}