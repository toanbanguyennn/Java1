package Bai4;

public class Fan {
    private int Slow,Medium,Fast;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public Fan(int slow, int medium, int fast, boolean on, double radius, String color) {
        Slow = slow;
        Medium = medium;
        Fast = fast;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
    }

    public int getSlow() {
        return Slow;
    }

    public void setSlow(int slow) {
        Slow = slow;
    }

    public int getMedium() {
        return Medium;
    }

    public void setMedium(int medium) {
        Medium = medium;
    }

    public int getFast() {
        return Fast;
    }

    public void setFast(int fast) {
        Fast = fast;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "Slow=" + Slow +
                ", Medium=" + Medium +
                ", Fast=" + Fast +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
