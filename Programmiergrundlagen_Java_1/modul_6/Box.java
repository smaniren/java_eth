package Programmiergrundlagen_Java_1.modul_6;

public class Box {
    private double height;
    private double length;
    private double depth;

    public Box(double height, double length, double depth) {
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    public Box() {
        this.height = 1.0;
        this.length = 1.0;
        this.depth = 1.0;
    }

    public Box(Box b) {
        this.height = b.getHeight();
        this.length = b.getLength();
        this.depth = b.getDepth();
    }

    public double getVolume() {
        return this.depth * this.height * this.length;
    }

    public double getSurface() {
        return (2 * this.height * this.length) + (2 * this.length * this.depth) + (2 * this.depth * this.height);
    }

    public boolean equals(Box b) {
        if (b.getVolume() != this.getVolume()) {
            return false;
        }
        return true;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

}
