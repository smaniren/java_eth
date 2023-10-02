package Programmiergrundlagen_Java_1.modul_5;

public class Fluggesellschaft {
    public static void main(String[] args) {
        Flugzeug a320 = new Flugzeug(1, "Airbus 320", 165, 890.00, 12600.00);
        Flugzeug b747 = new Flugzeug(2, "Boeing 747", 436, 907, 13700);
        Flugzeug avro85 = new Flugzeug(3, "Avro RJ87", 93, 760, 2200);
        Flugzeug a380 = new Flugzeug(4, "Airbus 380", 516, 907, 12000);
        Flugzeug a380b = new Flugzeug(4, null, 0, a380.geschwindigkeit, a380.reichweite);

        a380b.sitze = 409;
        a380b.bezeichnung = "Airbus 380-B";

        Flugzeug[] airline = new Flugzeug[5];

        airline[0] = a320;
        airline[1] = b747;
        airline[2] = avro85;
        airline[3] = a380;
        airline[4] = a380b;

        for (int i = 0; i < 5; i++) {
            airline[i].printInfo();
            double time = airline[i].getTime(6330.0);
            System.out.println("Dauer: " + time + " h");
            int cap = airline[i].getCapacity(365);
            System.out.println("Kapazität: " + cap + " Passagiere/Jahr");
        }

    }
}
