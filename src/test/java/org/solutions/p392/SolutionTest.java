package org.solutions.p392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void example1() {
        Solution sol = new Solution();
        assertTrue(sol.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void example2() {
        Solution sol = new Solution();
        assertTrue(sol.isSubsequence("", "tttt"));
    }

    @Test
    void example3() {
        Solution sol = new Solution();
        assertTrue(sol.isSubsequence("b", "abc"));
    }
}
