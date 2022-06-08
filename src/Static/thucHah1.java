package Static;

public class thucHah1 {
    public static void main(String[] args) {
        thucHanh1.change(); //calling change method

        //creating objects
        thucHanh1 s1 = new thucHanh1(111, "Hoang");
        thucHanh1 s2 = new thucHanh1(222, "Khanh");
        thucHanh1 s3 = new thucHanh1(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
