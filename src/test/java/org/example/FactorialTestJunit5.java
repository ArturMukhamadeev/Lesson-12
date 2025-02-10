package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTestJunit5 {
    @Test
    void testFactorialZero() {
        assertEquals(1, Factorial.compute(0));
    }

    @Test
    void testFactorialOne() {
        assertEquals(1, Factorial.compute(1));
    }

    @Test
    void testFactorialPositive() {
        assertEquals(120, Factorial.compute(5));
    }

    @Test
    void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.compute(-1));
        assertEquals("Факториал отрицательного числа не определен.", exception.getMessage());
    }
}
