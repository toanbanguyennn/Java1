package SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaffManager staffManager = new StaffManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Add by index");
            System.out.println("3. Update by index");
            System.out.println("4. Delete by index");
            System.out.println("5. Display by index");
            System.out.println("6. Display all");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    staffManager.addStaff();
                    break;
                case 2:
                    staffManager.addStaffByIndex();
                    break;
                case 3:
                    staffManager.updateStaff();
                    break;
                case 4:
                    staffManager.deleteStaff();
                    break;
                case 5:
                    staffManager.displayStaffByIndex();
                    break;
                case 6:
                    staffManager.displayAll();
                    break;
            }
        } while (choice != 0);
    }

}
