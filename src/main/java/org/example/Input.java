package org.example;

import java.util.Scanner;

public class Input {

    final Scanner scanner = new Scanner(System.in);

    int getIntegerValue(
            String message,
            String error,
            int downLimit,
            int upLimit
    ) {
        while(true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result >= downLimit && result <= upLimit) return result;
                System.out.println(error);
            } else {
                System.out.println(error);
                scanner.next();
            }
        }
    }

    void release() {
        scanner.close();
    }

}
