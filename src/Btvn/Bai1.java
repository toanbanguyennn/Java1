package Btvn;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1)+ ": ");
            scanner.nextLine();
            arr[i] = scanner.nextLine();

        }
        System.out.print("Các phần tử của mảng: ");
        show(arr);
            }  public static void show(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}