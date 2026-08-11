// Last updated: 11/08/2026, 19:02:26
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 2) {
4            return 0;
5        }
6
7        boolean[] isComposite = new boolean[n];
8        int count = 0;
9
10        for (int i = 2; i * i < n; i++) {
11            if (!isComposite[i]) {
12                for (int j = i * i; j < n; j += i) {
13                    isComposite[j] = true;
14                }
15            }
16        }
17
18        for (int i = 2; i < n; i++) {
19            if (!isComposite[i]) {
20                count++;
21            }
22        }
23
24        return count;
25    }
26}