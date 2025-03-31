package org.solutions.custom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleBitSetTest {

    @Test
    void whenCreateSimpleBitSetAnyValueShouldBeFalse() {
        SimpleBitSet simpleBitSet = new SimpleBitSet();
        assertFalse(simpleBitSet.getBit(13));
    }

    @Test
    void whenSetValueTrueGetValueShouldBeTrue() {
        SimpleBitSet simpleBitSet = new SimpleBitSet();
        simpleBitSet.setBit(1, true);
        assertTrue(simpleBitSet.getBit(1));
    }

    @Test
    void whenBitValueFalseGetValueShouldBeFalse() {
        SimpleBitSet simpleBitSet = new SimpleBitSet();
        simpleBitSet.setBit(1, true);
        assertFalse(simpleBitSet.getBit(5));
    }

    @Test
    void example() {
        int x = 1;
        int y = 2;
        int z = x | y;
        //z = 3
    }


}
