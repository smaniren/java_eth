package Programmiergrundlagen_Java_1.modul_6;

public class BallFabrik {
    public static void main(String[] args) {
        Ball[] baelle = new Ball[20];
        double volume = 0;
        double surface = 0;

        for (int i = 0; i < baelle.length; i++) {
            baelle[i] = new Ball(Math.random() * 10);
            baelle[i].print();
            volume += baelle[i].getVolume();
            surface += baelle[i].getSurface();
        }
        System.out.println("Gesamtes Volumen: " + volume);
        System.out.println("Gesamte Oberfläche: " + surface);
    }
}