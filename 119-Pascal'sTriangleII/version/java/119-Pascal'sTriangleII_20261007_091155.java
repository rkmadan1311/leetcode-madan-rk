// Last updated: 07/10/2026, 09:11:55
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> result = new ArrayList<>();
4
5        long value = 1;
6
7        for (int i = 0; i <= rowIndex; i++) {
8            result.add((int) value);
9            value = value * (rowIndex - i) / (i + 1);
10        }
11
12        return result;
13    }
14}