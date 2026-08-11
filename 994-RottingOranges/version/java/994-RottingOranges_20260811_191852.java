// Last updated: 11/08/2026, 19:18:52
1import java.util.*;
2
3class Solution {
4    public int orangesRotting(int[][] grid) {
5        int rows = grid.length;
6        int cols = grid[0].length;
7
8        Queue<int[]> queue = new LinkedList<>();
9        int fresh = 0;
10
11        // Add all rotten oranges to queue
12        for (int i = 0; i < rows; i++) {
13            for (int j = 0; j < cols; j++) {
14                if (grid[i][j] == 2) {
15                    queue.offer(new int[]{i, j});
16                } else if (grid[i][j] == 1) {
17                    fresh++;
18                }
19            }
20        }
21
22        int minutes = 0;
23        int[][] directions = {
24            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
25        };
26
27        // BFS
28        while (!queue.isEmpty() && fresh > 0) {
29            int size = queue.size();
30
31            for (int i = 0; i < size; i++) {
32                int[] current = queue.poll();
33
34                for (int[] dir : directions) {
35                    int r = current[0] + dir[0];
36                    int c = current[1] + dir[1];
37
38                    if (r >= 0 && r < rows &&
39                        c >= 0 && c < cols &&
40                        grid[r][c] == 1) {
41
42                        grid[r][c] = 2;
43                        fresh--;
44
45                        queue.offer(new int[]{r, c});
46                    }
47                }
48            }
49
50            minutes++;
51        }
52
53        return fresh == 0 ? minutes : -1;
54    }
55}