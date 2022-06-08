package LuyenTap;

import java.util.Scanner;

public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so n :");
        int n = scanner.nextInt();
        System.out.println(GiaiThua(n));
    }
    public static int GiaiThua(int a){
        int KQ = 1;
        for (int i = 2; i <= a; i++) {
            KQ = KQ * i;
        }
        return KQ;
    }


}
