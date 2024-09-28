package org.solutions.p100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void example1 () {
//        Solution sol = new Solution();
        SolutionAlt sol = new SolutionAlt();
        TreeNode trlp = new TreeNode(2, null, null);
        TreeNode trrp = new TreeNode(3, null, null);
        TreeNode trp = new TreeNode(1, trlp, trrp);

        TreeNode trlq = new TreeNode(2, null, null);
        TreeNode trrq = new TreeNode(3, null, null);
        TreeNode trq = new TreeNode(1, trlq, trrq);

        sol.isSameTree(trp, trq);
    }

    @Test
    void example2 () {
//        Solution sol = new Solution();
        SolutionAlt2 sol = new SolutionAlt2();
        TreeNode trlp = new TreeNode(2, null, null);
        TreeNode trp = new TreeNode(1, trlp, null);

        TreeNode trrq = new TreeNode(2, null, null);
        TreeNode trq = new TreeNode(1, null, trrq);

        assert !sol.isSameTree(trp, trq);
    }

    @Test
    void example3 () {
        Solution sol = new Solution();
        assert sol.isSameTree(null, null);
    }

    @Test
    void example4 () {
        SolutionAlt sol = new SolutionAlt();
        TreeNode trlp = new TreeNode(3, null, null);
        TreeNode trp = new TreeNode(1, trlp, null);

        TreeNode trrq = new TreeNode(2, null, null);
        TreeNode trq = new TreeNode(1, null, trrq);
        assert !sol.isSameTree(trp, null);
    }

}
