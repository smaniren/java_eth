package Programmiergrundlagen_Java_1.modul_2;

import java.util.Scanner;

public class Notenschnitt {
    public static void main(String[] args) {
        double mean;
        double grade;
        double gradeSum = 0.0;
        int gradeCount = 0;

        System.out.println("Bitte geben Sie ihre Noten ein (0 für Eingabe beenden):");
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                gradeCount += 1;
                System.out.print(gradeCount + ". Note: ");
                grade = scanner.nextDouble();
                gradeSum += grade;

            } while (grade != 0);
        }
        mean = gradeSum / (gradeCount - 1);
        System.out.println("Sie haben " + (gradeCount - 1) + " Noten eingegeben. Schnitt = " + mean);

    }
}
