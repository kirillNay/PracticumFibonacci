package org.example;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    private Output output = new Output();

    int getIntInput() {
        output.print("Введите длину последовательности");

        int result;
        while(true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0 && input < 100) {
                    result = input;
                    break;
                } else {
                    output.print("Введите целочисленное значение в соответствии с границами");
                }
            } else {
                output.print("Введите целочисленное значение");
                scanner.next();
            }
        }

        return result;
    }

}
