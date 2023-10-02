package Programmiergrundlagen_Java_1.modul_2;

import java.util.Scanner;

public class Pin {

    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
        System.out.print("1. Ziffer: ");
        a = scanner.nextInt();
        System.out.print("2. Ziffer: ");
        b = scanner.nextInt();
        System.out.print("3. Ziffer: ");
        c = scanner.nextInt();
        System.out.println("Sie haben eingegeben: " + a + b + c);
        if (a == 1 && b == 2 && c == 1) {
            System.out.print("offen");
        } else {
            System.out.print("falscher Pin");
        }
    }
}