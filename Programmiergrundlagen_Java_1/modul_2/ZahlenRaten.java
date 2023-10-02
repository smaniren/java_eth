package Programmiergrundlagen_Java_1.modul_2;

import java.util.Scanner;

public class ZahlenRaten {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = 0;
            int answer = 10;
            int input;

            System.out.println("Gesucht ist eine Zahl zwischen 1 und 100. raten Sie!");

            do {
                input = scanner.nextInt();
                counter += 1;
                if (input < answer) {
                    System.out.println("zu klein");
                } else if (input > answer) {
                    System.out.println("zu gross");
                }
            } while (answer != input);

            System.out.println("Erraten! " + counter + " mal geraten.");
        }
    }
}
