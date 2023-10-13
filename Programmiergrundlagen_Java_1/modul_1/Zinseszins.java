package Programmiergrundlagen_Java_1.modul_1;

public class Zinseszins {
    public static void main(String[] args) {
        double zinssatz = 0.05;
        double kontostand = 10000;
        int dauerJ = 10;
        for (int i = 1; i <= dauerJ; i++) {
            double zinsbetrag = kontostand * zinssatz;
            kontostand = zinsbetrag + kontostand;
            System.out.println("Im " + i + ". Jahr gibt es " + zinsbetrag + " Fr. Zins. Neuer Kontostand: "
                    + kontostand + " Fr.");
        }
    }
}
