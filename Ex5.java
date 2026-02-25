package spring;

import java.util.function.Function;

class MathUtils {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Ex5 {

    public static void main(String[] args) {

        Function<Integer, Integer> factRef = MathUtils::factorial;

        System.out.println("Factorial of 5: " + factRef.apply(5));
        System.out.println("Factorial of 4: " + factRef.apply(4));
    }
}