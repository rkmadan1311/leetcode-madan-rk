// Last updated: 11/08/2026, 19:15:41
1class Solution {
2
3    public void solveSudoku(char[][] board) {
4        solve(board);
5    }
6
7    private boolean solve(char[][] board) {
8
9        for (int row = 0; row < 9; row++) {
10            for (int col = 0; col < 9; col++) {
11
12                if (board[row][col] == '.') {
13
14                    for (char num = '1'; num <= '9'; num++) {
15
16                        if (isValid(board, row, col, num)) {
17
18                            board[row][col] = num;
19
20                            if (solve(board)) {
21                                return true;
22                            }
23
24                            board[row][col] = '.';
25                        }
26                    }
27
28                    return false;
29                }
30            }
31        }
32
33        return true;
34    }
35
36    private boolean isValid(char[][] board, int row, int col, char num) {
37
38        // Check row
39        for (int j = 0; j < 9; j++) {
40            if (board[row][j] == num) {
41                return false;
42            }
43        }
44
45        // Check column
46        for (int i = 0; i < 9; i++) {
47            if (board[i][col] == num) {
48                return false;
49            }
50        }
51
52        // Check 3 x 3 box
53        int startRow = (row / 3) * 3;
54        int startCol = (col / 3) * 3;
55
56        for (int i = startRow; i < startRow + 3; i++) {
57            for (int j = startCol; j < startCol + 3; j++) {
58                if (board[i][j] == num) {
59                    return false;
60                }
61            }
62        }
63
64        return true;
65    }
66}