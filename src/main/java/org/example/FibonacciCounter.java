package org.example;

public class FibonacciCounter {

    int a = 0;

    int b = 1;

    String getSequence(int length) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int sum = a + b;
            String line = String.format("%d. %d + %d = %d\n", i + 1, a, b, a + b);

            a = b;
            b = sum;

            result.append(line);
        }

        return result.toString();
    }

}
