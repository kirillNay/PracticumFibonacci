package org.example;

public class FibonacciSequence {

    /**
     *  1. 0 + 1 = 1
     *  2. 1 + 1 = 2
     *  3. 1 + 2 = 3
     *  4. 3 + 2 = 5
     *  5. 3 + 5 = 8
     */

    String getSequence(int length) {
        int firstValue = 0;
        int secondValue = 1;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // Формирование текущей строчки
            int sum = firstValue + secondValue;
            builder.append(String.format("%d. %d + %d = %d\n", i + 1, firstValue, secondValue, sum));

            // Подготовка следующей строчки
            firstValue = secondValue;
            secondValue = sum;
        }

        return builder.toString();
    }

}
