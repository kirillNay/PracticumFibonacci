package org.example;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public int getIntInput(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

}
