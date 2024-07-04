package org.example;

import java.util.Scanner;

public class Input {

    int getIntegerValue(String message, String errorMessage) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result > 0 && result <= 100) return result;

                System.out.println(errorMessage);
            } else {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }

    }

}
