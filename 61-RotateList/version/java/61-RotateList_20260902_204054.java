// Last updated: 02/09/2026, 20:40:54
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0)
4            return head;
5
6        int n = 1;
7        ListNode tail = head;
8
9        while (tail.next != null) {
10            tail = tail.next;
11            n++;
12        }
13
14        k = k % n;
15        if (k == 0)
16            return head;
17
18        tail.next = head;
19
20        int steps = n - k;
21        ListNode newTail = tail;
22
23        while (steps-- > 0)
24            newTail = newTail.next;
25
26        ListNode newHead = newTail.next;
27        newTail.next = null;
28
29        return newHead;
30    }
31}