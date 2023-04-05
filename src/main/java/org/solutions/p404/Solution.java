package org.solutions.p404;

  class TreeNode {
      int val;
      TreeNode right;
      TreeNode left;
      TreeNode() {}

      TreeNode(int val) { this.val = val; }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    private int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
        int res = 0;
        if (root.left != null) {
            res  += sumOfLeftLeaves(root.left, true);
        }
        if (root.right != null) {
            res += sumOfLeftLeaves(root.right, false);
        }

        if (isLeft && isLeaf(root)) {
            res += root.val;
        }
        return res;
    }
    public int sumOfAllLeaves(TreeNode root) {
        int res = 0;
        if (root.left != null) {
            res  += sumOfAllLeaves(root.left);
        }
        if (root.right != null) {
            res += sumOfAllLeaves(root.right);
        }

        if (isLeaf(root)) {
            res += root.val;
        }
        return res;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left  == null && node.right == null;
    }
}