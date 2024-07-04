package org.example;


/**
 *  Пример вывода:
 *  1. 0 + 1 = 1
 *  2. 1 + 1 = 2
 *  3. 1 + 2 = 3
 *  4. 3 + 2 = 5
 *  5. 3 + 5 = 8
 */

public class FibonacciSequenceCreator {

    String createSequence(int length) {
        int firstNumber = 0;
        int secondNumber = 1;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // Формируем значения для текущей итерации
            int sum = firstNumber + secondNumber;

            String line = String.format("%d. %d + %d = %d\n", i + 1, firstNumber, secondNumber, sum);

            result.append(line);

            // Подготавливаем значения для следующей итерации
            firstNumber = secondNumber;
            secondNumber = sum;
        }

        return result.toString();
    }

}
