package KtraSoNguyen;

import java.util.Scanner;

public class KtraSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so:");
        int num = scanner.nextInt();
        boolean check = false;
        if (num < 2) {
            System.out.println("Khong la so NT");
        } else
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("Num k là so NT");
                    check = true;
                    break;
                }
            }
                if (!check)
                 System.out.println("Num là số NT");

    }
}
