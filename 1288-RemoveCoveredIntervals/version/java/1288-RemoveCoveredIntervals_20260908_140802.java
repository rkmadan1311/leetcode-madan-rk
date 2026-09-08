// Last updated: 08/09/2026, 14:08:02
1class Solution {
2    public int removeCoveredIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> {
4            if (a[0] == b[0])
5                return b[1] - a[1];
6            return a[0] - b[0];
7        });
8
9        int count = 0;
10        int maxEnd = 0;
11
12        for (int[] interval : intervals) {
13            if (interval[1] > maxEnd) {
14                count++;
15                maxEnd = interval[1];
16            }
17        }
18
19        return count;
20    }
21}