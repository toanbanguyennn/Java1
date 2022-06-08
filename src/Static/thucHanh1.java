package Static;

public class thucHanh1 {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public thucHanh1(int i, String hoang) {
    }

    //constructor to initialize the variable
    void Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}


