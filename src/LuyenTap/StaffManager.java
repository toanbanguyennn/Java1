package LuyenTap;

import java.util.Scanner;

public class StaffManager {
    public static void main(String[] args) {
        Bai2 staffManager = new Bai2();
        Scanner scanner = new Scanner(System.in);
        int choice;


    do {
        System.out.println("Menu");
        System.out.println("1. Thêm Student");
        System.out.println("2. Sửa thông tin Student");
        System.out.println("3. Xóa Student");
        System.out.println("4. Hiển thị thông tin Student");
        System.out.println("0. Thoát");
        System.out.println("Nhập vào lựa chọn của bạn: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
               staffManager.addStaff(scanner);
                break;
            case 2:
                staffManager.updateStaff();
                break;
            case 3:
               staffManager.deleteStaff();
                break;
            case 4:
                staffManager.display(scanner);
                break;
        }
        System.out.println("-------------------------");
    }while (choice != 0);
}


}
