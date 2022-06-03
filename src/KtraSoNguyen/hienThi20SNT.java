package KtraSoNguyen;

import java.util.Scanner;

public class hienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap so Nguyen to can hien thi");
        int n = scanner.nextInt();
        int count =0, number =0;
        while (count<n) {
            if(isPrime(number)){
                System.out.println(number);
                count++;
            }
            number ++;
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
