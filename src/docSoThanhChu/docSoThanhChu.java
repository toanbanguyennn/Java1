package docSoThanhChu;

import java.util.Scanner;

public class docSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số bất kỳ: ");
        int number = scanner.nextInt();
        int numNames = number % 10;
        int tensNames = (number % 100) / 10;
        int hundNames = number / 100;
        if (number < 0 || number > 999) {
            System.out.println("nhập sai số, mời nhập lại");
        } else if (number == 0) {
            System.out.println("Zero");
        } else if (number < 20) {
            String word = numNames(number);
            System.out.println(word);
        } else {
            String word;
            if (hundNames == 0) {
                word = tensNames(tensNames) + " " + numNames(numNames);
            } else if (tensNames == 1) {
                word = numNames(hundNames) + " hundred " + numNames(number % 100);
            } else {
                word = numNames(hundNames) + " hundred " + tensNames(tensNames) + " " + numNames(numNames);
            }
            System.out.println(word);
        }

    }
    public static String tensNames(int number) {
        String tensNames = "";
        switch (number) {
            case 2:
                tensNames = "twenty";
                break;
            case 3:
                tensNames = "thirty";
                break;
            case 4:
                tensNames = "forty";
                break;
            case 5:
                tensNames = "fifty";
                break;
            case 6:
                tensNames = "sixty";
                break;
            case 7:
                tensNames = "seventy";
                break;
            case 8:
                tensNames = "eighty";
                break;
            case 9:
                tensNames = "ninety";
                break;
        }
        return tensNames;
    }

    public static String numNames(int number) {
        String numNamesWord = "";
        switch (number) {
            case 1:
                numNamesWord = "one";
                break;
            case 2:
                numNamesWord = "two";
                break;
            case 3:
                numNamesWord = "three";
                break;
            case 4:
                numNamesWord = "four";
                break;
            case 5:
                numNamesWord = "five";
                break;
            case 6:
                numNamesWord = "six";
                break;
            case 7:
                numNamesWord = "seven";
                break;
            case 8:
                numNamesWord = "eight";
                break;
            case 9:
                numNamesWord = "nine";
                break;
            case 10:
                numNamesWord = "ten";
                break;
            case 11:
                numNamesWord = "eleven";
                break;
            case 12:
                numNamesWord = "twelve";
                break;
            case 13:
                numNamesWord = "thirteen";
                break;
            case 14:
                numNamesWord = "fourteen";
                break;
            case 15:
                numNamesWord = "fifteen";
                break;
            case 16:
                numNamesWord = "sixteen";
                break;
            case 17:
                numNamesWord = "seventeen";
                break;
            case 18:
                numNamesWord = "eighteen";
                break;
            case 19:
                numNamesWord = "nineteen";
                break;
        }
        return numNamesWord;
    }
}