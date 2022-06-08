package LuyenTap;

public class Staff {
    private String name;
    private int age;
    private String gender;
    private double salary;

    public Staff(String name,int age,String gender,double salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public double getSalary() {
        return salary;
    }
}
