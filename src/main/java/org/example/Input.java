package org.example;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public int getIntegerValue(
            String message,
            String errorMessage,
            int upperLimit,
            int downLimit
    ) {
        while(true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result < upperLimit && result > downLimit) return result;

                System.out.println(errorMessage);
            } else {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
    }

    public void release() {
        scanner.close();
    }

}
