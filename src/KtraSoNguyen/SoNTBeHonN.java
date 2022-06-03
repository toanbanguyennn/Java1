package KtraSoNguyen;

import java.util.Scanner;

public class SoNTBeHonN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap giơi han soNT can hien thi");
        int GioiHan = scanner.nextInt();
        int number = 0;
        while (number < GioiHan) {
            if (SoNT(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    public static boolean SoNT(int number) {
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


