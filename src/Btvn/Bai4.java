package Btvn;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//       int number=0;
//       int sum = 0;
//        for (int k = 13; sum+k <= 500 ; k++) {
//            if(Bai3.checkSNT(k)){
//                sum +=k;
//                number++;
//            }
//        }
        int []array= new int[30];
        int sum1=0;
        for (int k = 13,i=0; sum1+k < 500 ; k++) {
            if(Bai3.checkSNT(k)){
                sum1 +=k;
                array[i]=k;
                i++;
            }
        }
        for (int element:array) {
           if (element !=0)
                System.out.println(element);
            }

//        public static boolean checkSNT(int n) {
//            if (n < 2) {
//                return false;
//            } else
//                for (int i = 2; i < n; i++) {
//                    if (n % i == 0) {
//                        return false;
//                    }
//                }
//            return true;
//
//        }
    }
}

