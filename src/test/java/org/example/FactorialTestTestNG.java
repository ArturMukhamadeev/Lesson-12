package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialTestTestNG {
    @Test
    public void testFactorialZero() {
        assertEquals(Factorial.compute(0), 1);
    }

    @Test
    public void testFactorialOne() {
        assertEquals(Factorial.compute(1), 1);
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(Factorial.compute(5), 120);
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.compute(-1));
    }
}
