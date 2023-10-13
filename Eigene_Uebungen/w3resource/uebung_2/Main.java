package Eigene_Uebungen.w3resource.uebung_2;

public class Main {
    public static void main(String[] args) {
        Dog hasso = new Dog("Hasso", "Terrier");
        Dog bello = new Dog("Bello", "Doberman");
        System.out.println(hasso.toString());
        System.out.println(bello.toString());

        hasso.setBreed("chihuahua");
        bello.setName("Hund");
        System.out.println(hasso.toString());
        System.out.println(bello.toString());

    }
}
