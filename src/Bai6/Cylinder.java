package Bai6;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volume(){
        return Cylinder.super.Area()*height;
    }
}
