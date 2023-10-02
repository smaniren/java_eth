package Programmiergrundlagen_Java_1.modul_1;

import java.util.Scanner;

public class Chiffre {

    public static void main(String[] args) {
        boolean isDecrypt;
        String encryptedText = "";
        String inputText;
        int encryptionKey;
        int modifiedCharInt;
        char modifiedChar;
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Encrypt (true) or decrypt (false)? ");
            isDecrypt = inputScanner.nextBoolean();

            System.out.print("Please enter the text: ");
            inputText = inputScanner.next();
            System.out.print("Please enter the encryption/decryption key: ");
            encryptionKey = inputScanner.nextInt();
        }

        if (isDecrypt) {
            encryptionKey = -encryptionKey;
        }

        for (int i = 0; i < inputText.length(); i++) {
            modifiedCharInt = (int) inputText.charAt(i) + encryptionKey;
            modifiedChar = (char) modifiedCharInt;
            encryptedText += modifiedChar;
        }

        System.out.print(encryptedText);
    }
}
