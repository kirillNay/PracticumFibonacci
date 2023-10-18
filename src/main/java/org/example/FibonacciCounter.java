package org.example;

public class FibonacciCounter {

    String getSequence(int length) {
        String result = "";
        int firstValue = 1;
        int secondValue = 0;
        for (int i = 1; i <= length; i++) {
            int sum = firstValue + secondValue;

            result = result + String.format("%d. %d + %d = %d\n", i, secondValue, firstValue, sum);

            secondValue = firstValue;
            firstValue = sum;
        }

        return result;
    }

}
