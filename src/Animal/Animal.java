package Animal;

public class Animal {
    private int weight;
    private int height;
    private  String gender;
    private  String color;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }
    public Animal(int weight, int height, String gender, String color) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
