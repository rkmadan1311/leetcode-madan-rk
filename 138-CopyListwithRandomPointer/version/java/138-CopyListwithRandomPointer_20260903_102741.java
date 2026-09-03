// Last updated: 03/09/2026, 10:27:41
1class Solution {
2    public Node copyRandomList(Node head) {
3        if (head == null) return null;
4
5        // Create copied nodes
6        Node curr = head;
7        while (curr != null) {
8            Node copy = new Node(curr.val);
9            copy.next = curr.next;
10            curr.next = copy;
11            curr = copy.next;
12        }
13
14        // Connect random pointers
15        curr = head;
16        while (curr != null) {
17            if (curr.random != null) {
18                curr.next.random = curr.random.next;
19            }
20            curr = curr.next.next;
21        }
22
23        // Separate original and copied lists
24        curr = head;
25        Node newHead = head.next;
26
27        while (curr != null) {
28            Node copy = curr.next;
29            curr.next = copy.next;
30
31            if (copy.next != null) {
32                copy.next = copy.next.next;
33            }
34
35            curr = curr.next;
36        }
37
38        return newHead;
39    }
40}