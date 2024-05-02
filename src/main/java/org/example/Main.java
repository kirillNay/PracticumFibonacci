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

 1. ----- Получить длину с консоли
 2. ----- Составление последовательности
 3. ----- Формирование результата и вывод в консоль
 4. Сохранение проекта и создание Pull Request

 */

public class Main {

    public static void main(String[] args) {
        Input input = new Input();

        int length = input.getInteger("Введите длину последовательности");
        System.out.println(length);

        FibonacciSequence sequence = new FibonacciSequence();
        String result = sequence.formSequence(length);

        System.out.println(result);
    }

}