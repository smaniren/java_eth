package Programmiergrundlagen_Java_1.modul_3;

import java.util.Scanner;

import Programmiergrundlagen_Java_1.modul_3.spiel.ZelleLeer;

public class spiel {
    class ZelleLeer {
        int zeile;
        int spalte;

        // Constructor to initialize the object
        public ZelleLeer(int zeile, int spalte) {
            this.zeile = zeile;
            this.spalte = spalte;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an instance of the outer class 'spiel'
        spiel spiel = new spiel();
        int spielEnde = -1;
        // Create an instance of the inner class 'ZelleLeer' using the outer instance
        ZelleLeer zelleLeer = spiel.new ZelleLeer(1, 3);
        int[][] brett = {
                { 3, 4, 0 },
                { 7, 8, 5 },
                { 2, 1, 6 },

        };
        int zeile;
        int spalte;

        while (spielEnde == -1) {

            /* ÜBERSCHRIFT */
            System.out.print("S   ");
            for (int i = 0; i < brett[0].length; i++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println("");
            System.out.print("Z --");
            for (int i = 0; i < brett[0].length; i++) {
                System.out.print(("--"));
            }
            System.out.println("");

            /* ZAHLEN */
            for (int i = 0; i < brett.length; i++) {

                System.out.print((i + 1) + " | ");
                for (int j = 0; j < brett[i].length; j++) {
                    System.out.print(brett[i][j] + " ");
                    if (brett[i][j] == 0) {
                        zelleLeer.zeile = i;
                        zelleLeer.spalte = j;
                    }
                }
                System.out.println("");
            }

            /*
             * System.out.println("Leere Zelle: ");
             * System.out.println("Spalte: " + zelleLeer.spalte);
             * System.out.println("Zeile: " + zelleLeer.zeile);
             */

            System.out.println("Welches Feld möchten Sie verschieben?");
            System.out.print("Zeile: ");
            zeile = scanner.nextInt();
            System.out.print("Spalte: ");
            spalte = scanner.nextInt();

            brett[zelleLeer.zeile][zelleLeer.spalte] = brett[zeile - 1][spalte - 1];
            brett[zeile - 1][spalte - 1] = 0;

            if (zeile == -1 || spalte == -1) {
                spielEnde = 1;
            }
        }

    }
}
