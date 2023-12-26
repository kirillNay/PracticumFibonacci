package org.example;

import java.util.Scanner;

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
        FibonacciCounter counter = new FibonacciCounter();
        int length = getIntInput();
        String result = counter.getSequence(length);

        System.out.println(result);
    }

    private static int getIntInput() {
        System.out.println("Введите длину последовательности Фибоначи");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

}