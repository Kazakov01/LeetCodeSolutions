package org.solutions.p100;

public class SolutionAlt2 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null || p.val != q.val)
            return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

}

// PriorityQueue ознакомиться с информацией по максимуму
