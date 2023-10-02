package Programmiergrundlagen_Java_1.modul_6;

public class Firma {
    public static void main(String[] args) {
        int salary = 0;
        int space = 0;
        Mitarbeiter[] hug = new Mitarbeiter[100];

        for (int i = 0; i < 10; i++) {
            hug[i] = new Mitarbeiter(1);
        }

        for (int i = 10; i < 40; i++) {
            hug[i] = new Mitarbeiter(2);
        }

        for (int i = 40; i < 100; i++) {
            hug[i] = new Mitarbeiter(3);
        }

        for (Mitarbeiter mitarbeiter : hug) {
            salary += mitarbeiter.getSalary();
            space += mitarbeiter.getSpace();
        }
        System.out.println("Lohn: " + salary);
        System.out.println("Fläche: " + space);
    }
}
