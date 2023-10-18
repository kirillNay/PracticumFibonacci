package org.example;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public int getIntInput(String message) {
        System.out.println(message);
        while(!scanner.hasNextInt()) {
            System.out.println("Требуется ввести число!");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

}
