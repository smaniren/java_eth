package Eigene_Uebungen.w3resource.uebung_4;

public class Circle {
    private int radius;
    private double area;

    public double getArea() {
        return area;
    }

    private double perimeter;

    public double getPerimeter() {
        return perimeter;
    }

    public Circle(int radius) {
        this.radius = radius;
        this.setArea();
        this.setPerimeter();
    }

    public void setPerimeter() {
        this.perimeter = 2 * radius * Math.PI;
    }

    public void setArea() {
        this.area = Math.pow(radius, 2) * Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.setArea();
        this.setPerimeter();
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", area=" + area + ", perimeter=" + perimeter + "]";
    }

}
