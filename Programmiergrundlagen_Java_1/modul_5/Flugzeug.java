package Programmiergrundlagen_Java_1.modul_5;

public class Flugzeug {
    int id;
    String bezeichnung;
    int sitze;
    double geschwindigkeit;
    double reichweite;

    public Flugzeug(int id, String bezeichnung, int sitze, double geschwindigkeit, double reichweite) {
        this.bezeichnung = bezeichnung;
        this.id = id;
        this.sitze = sitze;
        this.geschwindigkeit = geschwindigkeit;
        this.reichweite = reichweite;
    }

    public Flugzeug() {
    }

    public void printInfo() {
        System.out.println(
                bezeichnung + ": " + sitze + " Sitze " + geschwindigkeit + "km/h mit reichweite " + reichweite + "km");
    }

    public double getTime(double distanz) {
        return distanz / geschwindigkeit;
    }

    public int getCapacity(int tage) {
        return tage * sitze;
    }
}
