package org.example;

public class FibonacciCounter {

    int a = 0;

    int b = 1;

    String getSequence(int length) {
        String result = "";

        for (int i = 0; i < length; i++) {
            int sum = a + b;
            String line = String.format("%d. %d + %d = %d\n", i + 1, a, b, a + b);

            a = b;
            b = sum;

            result += line;
        }

        return result;
    }

}
