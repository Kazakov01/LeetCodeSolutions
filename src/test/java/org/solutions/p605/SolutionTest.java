package org.solutions.p605;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void example1() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1);
        assertTrue(res);
    }

    @Test
    void example2() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2);
        assertFalse(res);
    }

    @Test
    void example3() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {1}, 0);
        assertTrue(res);
    }

    @Test
    void example4() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {0, 0, 1, 0, 0}, 1);
        assertTrue(res);
    }

    @Test
    void example5() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {0, 0}, 1);
        assertTrue(res);
    }

    @Test
    void myExample1() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {0, 0, 0, 0, 0}, 3);
        assertTrue(res);
    }

    @Test
    void myExample2() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {1, 0, 0, 0, 0, 1}, 2);
        assertFalse(res);
    }

    @Test
    void myExample3() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {0, 0, 0, 0, 0, 0}, 3);
        assertTrue(res);
    }



    @Test
    void myExample4() {
        Solution sol = new Solution();
        boolean res = sol.canPlaceFlowers(new int[] {0}, 1);
        assertTrue(res);
    }


}
