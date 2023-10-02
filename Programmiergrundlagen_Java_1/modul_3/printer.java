package Programmiergrundlagen_Java_1.modul_3;

public class printer {
    public static void main(String[] args) {
        String[][] brett = {
                { "X", "X", "X", "X", "X" },
                { " ", " ", " ", "X", " " },
                { " ", " ", "X", " ", " " },
                { " ", "X", " ", " ", " " },
                { "X", "X", "X", "X", "X" },
        };

        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                System.out.print(brett[i][j]);
            }
            System.out.println("");
        }
    }
}
