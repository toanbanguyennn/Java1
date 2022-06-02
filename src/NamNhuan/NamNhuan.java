package NamNhuan;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam : ");
        int year;
        year = scanner.nextInt();
        if (year%400==0||(year%4==0&&year%100!=0)){
            System.out.println("Nam Nhuan");
        }else
            System.out.println("K nhuan");
    }
}
