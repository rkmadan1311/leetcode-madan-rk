// Last updated: 11/08/2026, 19:10:34
1import java.util.*;
2
3class Solution {
4    public int findMinArrowShots(int[][] points) {
5        if (points.length == 0) {
6            return 0;
7        }
8
9        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
10
11        int arrows = 1;
12        long end = points[0][1];
13
14        for (int i = 1; i < points.length; i++) {
15            if (points[i][0] > end) {
16                arrows++;
17                end = points[i][1];
18            }
19        }
20
21        return arrows;
22    }
23}