package org.example;

public class FibonacciCounter {

    String getFibonacciSequence(int length) {
        StringBuilder result = new StringBuilder();

        int secondLastNumber = 0;
        int lastNumber = 1;

        for (int i = 0; i < length; i++) {
            int sum = secondLastNumber + lastNumber;
            result.append(String.format("%d. %d + %d = %d\n", i + 1, secondLastNumber, lastNumber, sum));

            secondLastNumber = lastNumber;
            lastNumber = sum;
        }

        return result.toString();
    }

}
