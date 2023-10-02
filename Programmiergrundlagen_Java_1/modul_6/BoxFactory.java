package Programmiergrundlagen_Java_1.modul_6;

public class BoxFactory {
    public static void main(String[] args) {
        double volume = 0.0;
        double surface = 0.0;
        Box[] boxen = new Box[100];
        for (int i = 0; i < boxen.length; i++) {
            if (i < 10) {
                boxen[i] = new Box();
            } else if (i < 90) {
                boxen[i] = new Box(Math.random() * 10, Math.random() * 10, Math.random() * 10);
            } else {
                boxen[i] = new Box(boxen[i - 10]);
            }
            volume += boxen[i].getVolume();
            surface += boxen[i].getSurface();
        }
        System.out.println("Volumen: " + volume);
        System.out.println("Fläche: " + surface);
    }
}
