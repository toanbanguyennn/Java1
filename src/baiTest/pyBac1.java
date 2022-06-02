package baiTest;

import java.util.Scanner;

public class pyBac1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);

        System.out.println("nhap he so a");
        float a = nhap.nextFloat();
        System.out.println("nhap he so b");
        float b = nhap.nextFloat();
        System.out.println("nhap he so c");
        float c = nhap.nextFloat();


        float Ketqua = (c - b) / a;
        if (a == 0) {
            if (b == c) {
                System.out.println("Phuong trinh vo so nghiem");
            } else if (b != c) {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("phuong trinh có nghiệm là : " + Ketqua);
        }
    }
}