package Bai5;

import java.util.Scanner;

public class AccessModifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào chiều cao của hình trụ: ");
        double a = input.nextDouble();
        Circle cylinder = new Circle();
        System.out.printf("Nhập vào bán kính hình tròn: ");
        double b = input.nextDouble();
        cylinder.setRadius(b);
        System.out.println(cylinder);
    }
}
