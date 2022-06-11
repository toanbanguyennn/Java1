package luyenntap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        MenuStaff menuStaffs = new MenuStaff();
        menuStaffs.addStaff(scanner);
        menuStaffs.display();

    }
}
