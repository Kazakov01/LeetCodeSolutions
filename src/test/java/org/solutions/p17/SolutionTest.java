package org.solutions.p17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.solutions.p17.Example;

import java.util.List;

public class SolutionTest {
    @Test
    void example1 () {
//        Solution sol = new Solution();
       Example example = new Example();
       List<String> list = example.combination(List.of("abc", "kmn", "xyz", "def"));

    }
}
