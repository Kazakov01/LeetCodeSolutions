package org.solutions.p1071;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void isStrDivisionCorrect() {
        Solution sol = new Solution();
        assert sol.strDivision("ABC", "A") == 0;
        assert sol.strDivision("ABCABC", "ABCABC") == 1;
        assert sol.strDivision("ABCABC", "ABC") == 2;
        assert sol.strDivision("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXX") == 0;
    }

    @Test
    void testGcdOfStrings() {
        Solution sol = new Solution();
        Assertions.assertEquals("ABC", sol.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    void testGcdOfStrings2() {
        Solution sol = new Solution();
        Assertions.assertEquals("", sol.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    void testGcdOfStrings3() {
        Solution sol = new Solution();
        Assertions.assertEquals("TAUXX", sol.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
