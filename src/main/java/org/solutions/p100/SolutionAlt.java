package org.solutions.p100;

import java.util.ArrayDeque;
import java.util.Queue;

public class SolutionAlt {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if ((p == null && q != null) ||( p != null && q== null))
            return false;

        if (p != null && q != null) {
            if (p.val != q.val)
                return false;
            isSameTree(p.left, q.left);
            isSameTree(p.right, q.right);
        }
        return true;
    }
}
