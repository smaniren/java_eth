package Programmiergrundlagen_Java_1.modul_3;

public class lotto {
    public static void main(String[] args) {
        // Array für 6 Lottozahlen
        int[] lottozahlen = new int[6];
        boolean sorted = false;
        int counter = 0;
        int memory = -1;
        // Ziehung der Lottozahlen
        for (int i = 0; i < lottozahlen.length; i++) {
            lottozahlen[i] = (int) (Math.random() * 49) + 1;

            // doppelte Ziehung verhindern
            for (int j = 0; j < i; j++) {
                if (lottozahlen[j] == lottozahlen[i]) {
                    i--;
                }
            }
        }

        System.out.println();
        while (sorted == false && counter < 1000) {
            sorted = true;
            counter++;

            for (int i = 0; i < (lottozahlen.length - 1); i++) {
                if (lottozahlen[i] > lottozahlen[i + 1]) {
                    memory = lottozahlen[i + 1];
                    lottozahlen[i + 1] = lottozahlen[i];
                    lottozahlen[i] = memory;
                    sorted = false;
                }
            }
        }
        System.out.println();
        System.out.println("counter: " + counter);
        System.out.println();

        for (int i = 0; i < lottozahlen.length; i++) {
            System.out.println(lottozahlen[i]);
        }
    }
}
