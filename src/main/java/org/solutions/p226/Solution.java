package org.solutions.p226;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root.left != null) {
            invertTree(root.left);
        }

        if (root.right != null) {
            invertTree(root.right);
        }

        TreeNode tmpLeft = root.left;
        root.left = root.right;
        root.right = tmpLeft;

        return root;
    }
}