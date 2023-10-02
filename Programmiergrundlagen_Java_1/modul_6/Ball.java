package Programmiergrundlagen_Java_1.modul_6;

public class Ball {
    private double radius;
    private static final double MEIN_PI = 3.1415;

    public Ball() {
        this.radius = 1.0;
    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * MEIN_PI * Math.pow(radius, 3);
    }

    public double getSurface() {
        return 4.0 * MEIN_PI * Math.pow(radius, 2);
    }

    public Ball(Ball b) {
        this.radius = b.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void print() {
        System.out.println("Radius: " + radius);
        System.out.println("Volumen: " + getVolume());
        System.out.println("Oberfläche: " + getSurface());
    }
}
