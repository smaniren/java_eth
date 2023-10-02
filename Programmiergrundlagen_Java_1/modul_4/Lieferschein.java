package Programmiergrundlagen_Java_1.modul_4;

public class Lieferschein {
    public static void main(String[] args) {

        System.out.println("Lieferschein");
        line();
        System.out.println("Artikel 1		          15.90");
        System.out.println("Artikel 2		          21.90");
        System.out.println("Artikel 3		          32.50");
        line(40, "*");
        System.out.println("Preis total		          " + summe(15.90, 21.90, 32.50));
        line(40);
    }

    public static void line(int length, String mark) {

        for (int i = 0; i < length; i++) {
            System.out.print(mark);
        }
        System.out.println();
    } // Method with no parameters, using a default length

    public static void line(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    } // Method with no parameters, using a default length

    public static void line() {
        line(12); // Call the line method with a default length of 10
    }

    public static double summe(double v1, double v2, double v3) {
        return v1 + v2 + v3;
    }
}
