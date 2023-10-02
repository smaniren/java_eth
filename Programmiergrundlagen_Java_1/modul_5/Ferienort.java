package Programmiergrundlagen_Java_1.modul_5;

public class Ferienort {
    public static void main(String[] args) {
        Hotel sonne = new Hotel(5, 3, 2);
        Hotel mond = new Hotel(5, 10, 2);
        Hotel taube = new Hotel(20, 5, 23);

        taube.printInfo();

        taube.auschecken(2);
        taube.printInfo();
        taube.einchecken(75);
        taube.printInfo();
    }
}
