package org.solutions.p404;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {

    @Test
    void example1() {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        int res = sol.sumOfLeftLeaves(root);
        assertEquals(24,res);
    }

    @Test
    void example2() {
        Solution sol = new Solution();
        int res = sol.sumOfLeftLeaves(new TreeNode(1));
        assertEquals(0, res);
    }

}
