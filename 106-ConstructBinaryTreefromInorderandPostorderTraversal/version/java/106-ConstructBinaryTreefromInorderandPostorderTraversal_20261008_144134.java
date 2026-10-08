// Last updated: 08/10/2026, 14:41:34
1class Solution {
2    int postIndex;
3
4    public TreeNode buildTree(int[] inorder, int[] postorder) {
5        postIndex = postorder.length - 1;
6        return build(inorder, postorder, 0, inorder.length - 1);
7    }
8
9    private TreeNode build(int[] inorder, int[] postorder, int left, int right) {
10        if (left > right) {
11            return null;
12        }
13
14        int rootValue = postorder[postIndex--];
15        TreeNode root = new TreeNode(rootValue);
16
17        int index = left;
18        while (inorder[index] != rootValue) {
19            index++;
20        }
21
22        // Build right subtree first
23        root.right = build(inorder, postorder, index + 1, right);
24
25        // Build left subtree
26        root.left = build(inorder, postorder, left, index - 1);
27
28        return root;
29    }
30}