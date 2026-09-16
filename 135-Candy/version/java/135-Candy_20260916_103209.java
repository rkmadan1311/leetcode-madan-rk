// Last updated: 16/09/2026, 10:32:09
1class Solution {
2    public int candy(int[] ratings) {
3        int n = ratings.length;
4        int[] candy = new int[n];
5
6        Arrays.fill(candy, 1);
7
8        for (int i = 1; i < n; i++) {
9            if (ratings[i] > ratings[i - 1]) {
10                candy[i] = candy[i - 1] + 1;
11            }
12        }
13
14        for (int i = n - 2; i >= 0; i--) {
15            if (ratings[i] > ratings[i + 1]) {
16                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
17            }
18        }
19
20        int total = 0;
21
22        for (int c : candy) {
23            total += c;
24        }
25
26        return total;
27    }
28}