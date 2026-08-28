// Last updated: 28/08/2026, 08:57:07
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode small = new ListNode(0);
4        ListNode large = new ListNode(0);
5
6        ListNode s = small;
7        ListNode l = large;
8
9        while (head != null) {
10            if (head.val < x) {
11                s.next = head;
12                s = s.next;
13            } else {
14                l.next = head;
15                l = l.next;
16            }
17            head = head.next;
18        }
19
20        l.next = null;
21        s.next = large.next;
22
23        return small.next;
24    }
25}