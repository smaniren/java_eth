package Eigene_Uebungen.w3resource.uebung_4;

public class Main {
    public static void main(String[] args) {
        Circle circ = new Circle(5);
        System.out.println(circ.toString());

        int r = 5;
        Circle circle = new Circle(r);
        System.out.println("Radius of the circle is " + r);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getPerimeter());
        r = 8;
        circle.setRadius(r);
        System.out.println("\nRadius of the circle is " + r);
        System.out.println("The area of the circle is now " + circle.getArea());
        System.out.println("The circumference of the circle is now " + circle.getPerimeter());
    }
}
