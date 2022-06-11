package Bai6;

public class Circle {
    public int radius;

    public Circle() {
        super();
    }

    public String color;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double Area() {
        return Math.PI*radius*radius;
    }
}
