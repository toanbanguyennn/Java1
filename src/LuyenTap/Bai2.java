package LuyenTap;

import java.util.Scanner;

public class Bai2 {
    private final StaffManager[] staffs= new StaffManager[10];
    private int[] staffAge;
    private static int index = 0;



    public void addStaff(Scanner scanner) {
        Staff staff = createStaff(scanner);

        index++;
    }

    private Staff createStaff(Scanner scanner) {
        System.out.println("Nhập tên học viên: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học viên: ");
        int age = scanner.nextInt();
        System.out.println("Nhập giới tính học viên: ");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        double avg = scanner.nextDouble();
        return new Staff(name, age, gender, avg);
    }

    public void deleteStaff() {
//        students[index] = null;
        System.out.println("Đây là phương thức xóa Student");

    }

    public void updateStaff() {
        System.out.println("Đây là phương thức sửa Student");
    }

    public void display(Scanner scanner) {
        for (StaffManager staff : staffs) {
            if (staff != null) {
                System.out.println(staff);
            }
        }
    }
}
