import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int hundredNotes;
            int fiftyNotes;
            int twentyNotes;
            int tenNotes;

            System.out.println("WILLKOMMEN BEI DER BANK IHRES VERTRAUENS");
            System.out.println("****************************************");
            System.out.print("Wie viel möchten Sie abheben? ");

            int input_value = input.nextInt();
            System.out.println("Eingegebener Geldbetrag: " + input_value + " Fr.");

            hundredNotes = input_value / 100;
            input_value = input_value % 100;
            System.out.println("100er: " + hundredNotes);
            fiftyNotes = input_value / 50;
            input_value = input_value % 50;
            System.out.println("50er: " + fiftyNotes);
            twentyNotes = input_value / 20;
            input_value = input_value % 20;
            System.out.println("20er: " + twentyNotes);
            tenNotes = input_value / 10;
            input_value = input_value % 10;
            System.out.println("10er: " + tenNotes);
            System.out.println("Rest: " + input_value);
        }

    }

}