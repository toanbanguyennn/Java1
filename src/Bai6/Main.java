package Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("radius:");
        int radius = scanner.nextInt();
        System.out.println("color:");
        String color = scanner.nextLine();
        scanner.nextLine();
        System.out.println("height:");
        int height = scanner.nextInt();
        Cylinder cylinder = new Cylinder(radius,color,height);
        System.out.println(cylinder.Area());
        System.out.println(cylinder.volume());


    }
}
