package org.example;

public class FibonacciSequence {

    /**
     *  1. 0 + 1 = 1
     *  2. 1 + 1 = 2
     *  3. 1 + 2 = 3
     *  4. 3 + 2 = 5
     *  5. 3 + 5 = 8
     */

    public String getSequence(int length) {
        String result = "";

        int firstValue = 0;
        int secondValue = 1;

        for (int i = 0; i < length; i++) {
            // Формирование текущей строчки
            int sum = firstValue + secondValue;
            result += String.format("%d. %d + %d = %d\n", i + 1, firstValue, secondValue, sum);

            // Подготовка к следующей итерации
            firstValue = secondValue;
            secondValue = sum;
        }

        return result;
    }

}
