package Eigene_Uebungen.w3resource.uebung_3;

public class Rectangle {
    private int height;
    private int width;
    private int area;
    private int perimeter;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.setPerimeter();
        this.setArea();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.setPerimeter();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        this.setPerimeter();
    }

    public int getArea() {
        return area;
    }

    public void setArea() {
        this.area = height * width;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter() {
        this.perimeter = 2 * (height + width);
    }

    @Override
    public String toString() {
        return "Rectangle [height=" + height + ", width=" + width + ", area=" + area + ", perimeter=" + perimeter + "]";
    }

}
