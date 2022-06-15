package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManager {
    private ArrayList<Staff> staffs;

    public StaffManager() {
        this.staffs = new ArrayList<>();
    }

    public StaffManager(ArrayList<Staff> staffs) {
        this.staffs = staffs;
    }

    public void addSV() {

    }
    public void addStaff() {
        Staff staff = createNewStaff();
        staffs.add(staff);
    }

    public void addStaffByIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào index bạn muốn thêm: ");
        int index = input.nextInt();
        if (index < 0 || index >= staffs.size()) {
            System.out.println("Index không phù hợp");
        } else {
            Staff staff = createNewStaff();
            staffs.add(index, staff);
        }
    }

    private Staff createNewStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên của Staff");
        String name = input.nextLine();
        System.out.println("Nhập vào tuổi của Staff");
        int age = input.nextInt();
        System.out.println("Nhập vào lương của Staff");
        double salary = input.nextDouble();
        return new Staff(name, age, salary);
    }

    public void updateStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào index bạn muốn cập nhật: ");
        int index = input.nextInt();
        input.nextLine();
        if (index < 0 || index >= staffs.size()) {
            System.out.println("Index không phù hợp");
        } else {
            Staff staff = staffs.get(index);
            System.out.println("Nhập vào tên mới của Staff đang sửa");
            String name = input.nextLine();
            staff.setName(name);
            System.out.println("Nhập vào tuổi mới của Staff đang sửa");
            int age = input.nextInt();
            staff.setAge(age);
            System.out.println("Nhập vào lương mới của Staff đang sửa");
            double salary = input.nextDouble();
            staff.setSalary(salary);
            staffs.set(index, staff);
        }
    }

    public void deleteStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào index bạn muốn xóa: ");
        int index = input.nextInt();
        if (index < 0 || index >= staffs.size()) {
            System.out.println("Index không phù hợp");
        } else {
            staffs.remove(index);
        }
    }

    public void displayAll() {
        for (Staff staff : staffs) {
            System.out.println(staff);
        }

    }

    public void displayStaffByIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào index bạn muốn hiển thị: ");
        int index = input.nextInt();
        if (index < 0 || index > staffs.size()) {
            System.out.println("Index không phù hợp");
        } else {
            System.out.println(staffs.get(index));
        }
    }

}
