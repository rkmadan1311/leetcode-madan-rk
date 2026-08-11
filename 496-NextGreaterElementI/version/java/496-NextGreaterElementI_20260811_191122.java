// Last updated: 11/08/2026, 19:11:22
1import java.util.*;
2
3class Solution {
4    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
5        Map<Integer, Integer> map = new HashMap<>();
6        Stack<Integer> stack = new Stack<>();
7
8        // Find next greater element for nums2
9        for (int num : nums2) {
10            while (!stack.isEmpty() && stack.peek() < num) {
11                map.put(stack.pop(), num);
12            }
13            stack.push(num);
14        }
15
16        // Remaining elements have no greater element
17        while (!stack.isEmpty()) {
18            map.put(stack.pop(), -1);
19        }
20
21        int[] result = new int[nums1.length];
22
23        for (int i = 0; i < nums1.length; i++) {
24            result[i] = map.get(nums1[i]);
25        }
26
27        return result;
28    }
29}