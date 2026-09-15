// Last updated: 15/09/2026, 18:42:42
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int[] arr = new int[nums1.length + nums2.length];
4
5        int i = 0, j = 0, k = 0;
6
7        while (i < nums1.length) {
8            arr[k++] = nums1[i++];
9        }
10
11        while (j < nums2.length) {
12            arr[k++] = nums2[j++];
13        }
14
15        Arrays.sort(arr);
16
17        int n = arr.length;
18
19        if (n % 2 == 1) {
20            return arr[n / 2];
21        }
22
23        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
24    }
25}