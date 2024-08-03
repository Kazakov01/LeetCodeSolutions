package org.solutions.p100;

import java.util.ArrayDeque;
import java.util.Queue;

//bfs - breaths first search
//dfs - deep first search
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q== null)
            return true;
        if ((p == null && q != null) ||( p != null && q== null))
            return false;

        Queue<TreeNode> queueP = new ArrayDeque<>();
        queueP.offer(p);

        Queue<TreeNode> queueQ = new ArrayDeque<>();
        queueQ.offer(q);

        while (!queueP.isEmpty() && !queueQ.isEmpty()) {
            TreeNode tnP = queueP.poll();
            TreeNode tnQ = queueQ.poll();

            if (tnP.val != tnQ.val)
                return false;

            if ((tnP.right == null && tnQ.right != null) || (tnP.right != null && tnQ.right == null)
            || (tnP.left == null && tnQ.left != null) || (tnP.left != null && tnQ.left == null))
                return false;

            if (tnP.left != null && tnQ.left != null) {
                queueP.offer(tnP.left);
                queueQ.offer(tnQ.left);
            }
            if (tnP.right != null && tnQ.right != null) {
                queueP.offer(tnP.right);
                queueQ.offer(tnQ.right);
            }
        }
        return (queueQ.isEmpty() && queueP.isEmpty());
    }
}
