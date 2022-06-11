package Bai4;

import java.util.Scanner;

public class PtBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số 1:");
        int a = scanner.nextInt();
        System.out.println("Nhập hệ số 2:");
        int b = scanner.nextInt();
        System.out.println("Nhập hệ số 3:");
        int c = scanner.nextInt();
        Quadratic2 phuongTrinhBac2 = new Quadratic2(a, b, c);
        phuongTrinhBac2.tinhNghiem();
    }
}
