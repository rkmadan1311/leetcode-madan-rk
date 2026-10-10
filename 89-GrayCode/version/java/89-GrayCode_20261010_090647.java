// Last updated: 10/10/2026, 09:06:47
1import java.util.*;
2
3class Solution {
4    public List<Integer> grayCode(int n) {
5        List<Integer> list = new ArrayList<>();
6
7        for (int i = 0; i < (1 << n); i++) {
8            list.add(i ^ (i >> 1));
9        }
10
11        return list;
12    }
13}