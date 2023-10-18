package org.example;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    int getInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

}
