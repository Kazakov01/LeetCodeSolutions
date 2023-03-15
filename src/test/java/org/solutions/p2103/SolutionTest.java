package org.solutions.p2103;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void example1() {
        Solution sol = new Solution();
        int res = sol.countPoints("B0B6G0R6R0R6G9");
        Assertions.assertEquals(1, res);
    }

    @Test
    void example2() {
        Solution sol = new Solution();
        int res = sol.countPoints("B0R0G0R9R0B0G0");
        Assertions.assertEquals(1, res);
    }
}
