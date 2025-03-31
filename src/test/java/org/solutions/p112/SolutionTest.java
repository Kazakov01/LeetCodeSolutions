package org.solutions.p112;

import org.junit.jupiter.api.Test;
import org.solutions.p112.TreeNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {


    @Test
    void example1() {
        SolutionAlt sol = new SolutionAlt();
        TreeNode node5 = new TreeNode(13, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node8 = new TreeNode(2, null, null);
        TreeNode node9 = new TreeNode(1, null, null);
        TreeNode node6 = new TreeNode(4, null, node9);
        TreeNode node4 = new TreeNode(11, node7, node8);
        TreeNode node3 = new TreeNode(8, node5, node6);
        TreeNode node2 = new TreeNode(4, node4, null);
        TreeNode node1 = new TreeNode(5, node2, node3);
        sol.hasPathSum(node1, 22);
    }
}
