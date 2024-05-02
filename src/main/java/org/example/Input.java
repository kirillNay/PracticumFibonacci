package org.example;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public int getInteger(String message) {
        System.out.println(message);

        while(true) {
            if (!scanner.hasNextInt()) {
                System.out.println(message);
                scanner.nextLine();
            } else {
                int value = scanner.nextInt();
                if (value > 0) return value;

                System.out.println(message);
            }
        }
    }

}
