package Programmiergrundlagen_Java_1.modul_3;

import java.util.Scanner;

public class bowling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers;
        int numberOfRounds;

        System.out.print("Anzahl Spieler: ");
        numberOfPlayers = scanner.nextInt();
        System.out.print("Anzahl Runden: ");
        numberOfRounds = scanner.nextInt();

        int[][] results = new int[numberOfRounds][numberOfPlayers];
        int[] resultsSum = new int[numberOfPlayers];

        for (int i = 0; i < numberOfRounds; i++) {

            System.out.println("Runde " + (i + 1) + ": ");
            for (int j = 0; j < numberOfPlayers; j++) {
                System.out.print("Spieler " + (j + 1) + "--> Anzahl pins?");
                results[i][j] = scanner.nextInt();
                resultsSum[j] = resultsSum[j] + results[i][j];
            }
        }

        System.out.println("");
        System.out.println("****RESULTATE****");
        System.out.println("");
        System.out.println("          Spieler");
        System.out.println("-------------------");
        System.out.print("          ");
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        System.out.println("-------------------");
        for (int i = 0; i < numberOfRounds; i++) {
            System.out.print("Runde " + (i + 1) + ":  ");
            for (int j = 0; j < numberOfPlayers; j++) {
                System.out.print(results[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        System.out.print("Summe:    ");
        for (int i = 0; i < numberOfRounds; i++) {
            System.out.print(resultsSum[i] + "  ");
        }
        System.out.println("");
        System.out.println("-------------------");
    }
}
