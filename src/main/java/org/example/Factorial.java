package org.example;

public class Factorial {
    public static long compute(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
