package UCLN;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();
        if (a<0 || b < 0 ) {
            System.out.println("mời nhập lại");
        }else if ( a==0 || b ==0 )
            System.out.println("không có ước chung");
    else  {while (a != b) {
        if (a > b) {
            a -= b;
        } else {
            b -= a;
        }
    }
    int uscln = a ;
            System.out.println("uscln" + uscln);
}
}}
