package org.example;

public class FibonacciSequence {

    public String formSequence(int length) {
        int firstNumber = 0;
        int secondNumber = 1;

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= length; i++) {
            // Считаем текущую итерацию
            int sum = firstNumber + secondNumber;
            builder.append(String.format("%d. %d + %d = %d\n", i, firstNumber, secondNumber, sum));

            // Подготовка следующей итерации
            firstNumber = secondNumber;
            secondNumber = sum;
        }

        return builder.toString();
    }

}
