package Btvn;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        a = scanner.nextInt();
        if (Bai3.checkSNT(a)) {
            System.out.println("day la so nguyen to");

        } else {
            System.out.println("day khong phai la so nguyen to");
        }
    }

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        } else
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        return true;

    }
}

