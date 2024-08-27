package org.example;

/**
 Вывести последовательность Фибоначи заданной длины.
 Числа Фибоначи - последовательность чисел, в которой первые два числа равны 0 и 1,
 а каждое последующее число равно сумме двух предыдущих чисел.
 Пример: 0, 1, 1, 2, 3, 5, 8, 13, 21 ...

 Пример ввода:
 5
 Пример вывода:
 1. 0 + 1 = 1
 2. 1 + 1 = 2
 3. 1 + 2 = 3
 4. 3 + 2 = 5
 5. 3 + 5 = 8

 */

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        int length = input.getIntegerValue(
                "Введите длину последовательности",
                "Введено невалидное значение!",
                100,
                0
        );

        FibonacciSequence sequenceGenerator = new FibonacciSequence();
        String sequence = sequenceGenerator.getSequence(length);

        System.out.println(sequence);

        input.release();
    }

}