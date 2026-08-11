// Last updated: 11/08/2026, 19:01:37
1class Solution {
2    public int dayOfYear(String date) {
3        String[] parts = date.split("-");
4
5        int year = Integer.parseInt(parts[0]);
6        int month = Integer.parseInt(parts[1]);
7        int day = Integer.parseInt(parts[2]);
8
9        int[] days = {
10            31, 28, 31, 30, 31, 30,
11            31, 31, 30, 31, 30, 31
12        };
13
14        // Leap year
15        if (isLeapYear(year)) {
16            days[1] = 29;
17        }
18
19        int result = day;
20
21        for (int i = 0; i < month - 1; i++) {
22            result += days[i];
23        }
24
25        return result;
26    }
27
28    private boolean isLeapYear(int year) {
29        return (year % 400 == 0) ||
30               (year % 4 == 0 && year % 100 != 0);
31    }
32}