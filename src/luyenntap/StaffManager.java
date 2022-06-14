package luyenntap;

import java.util.Scanner;

public class StaffManager {
    private int index = 0;
    private Staff[] arrayStaff;

    public StaffManager() {
    }

    public int getIndex() {
        return index;
    }

    public Staff[] getArrayStaff() {
        return arrayStaff;
    }

    public void createArrayStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào độ dài bạn muốn của mảng chứa Staff: ");
        int length = input.nextInt();
        arrayStaff = new Staff[length];
    }

    public void addStaffInArrayStaff(Staff newStaff) {
        arrayStaff[index] = newStaff;
        index = index + 1;
    }

    public Staff createNewStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên của Staff thứ " + (index + 1) + ": ");
        String name = input.nextLine();
        System.out.println("Nhập vào tuổi của Staff thứ " + (index + 1) + ": ");
        int age = input.nextInt();
        System.out.println("Nhập vào lương của Staff thứ " + (index + 1) + ": ");
        double salary = input.nextDouble();
        return new Staff(name, age, salary);
    }

    public void updateStaffByIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào index bạn muốn cập nhật: ");
        int index = input.nextInt();
        //check xem index có phù hợp hay không
        if (index < 0 || index > arrayStaff.length - 1) {
            System.out.println("Vị trí vừa nhập không có trong mảng!");
        } else {
            Staff staff = arrayStaff[index];
            System.out.println("Nhập vào tên mới của Staff đang sửa");
            String name = input.nextLine();
            staff.setName(name);
            System.out.println("Nhập vào tuổi mới của Staff đang sửa");
            int age = input.nextInt();
            staff.setAge(age);
            System.out.println("Nhập vào lương mới của Staff đang sửa");
            double salary = input.nextDouble();
            staff.setSalary(salary);
        }
    }

    public void deleteStaffByIndexInArray() {
        //tạo 1 mảng mới có số phần tử bằng số phần từ của mảng staff - 1
        //đẩy các phần tử trong staff và mảng mới, ngoại trừ phần tử ở vị trí index

        //cần phân biệt 3 chỉ số thường dùng để thao tác với đối tượng trong mảng
        //chỉ số 1: index - vị trí của phần tử trong mảng
        //chỉ số 2: vị trí xuất hiện trên mảng
        //chỉ số 3: id của đối tượng nếu có
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào index bạn muốn xóa: ");
        int index = input.nextInt();
        if (index < 0 || index > arrayStaff.length - 1) {
            System.out.println("Vị trí vừa nhập không có trong mảng!");
        } else {
            Staff[] newStaff = new Staff[arrayStaff.length - 1];
            for (int i = 0; i < arrayStaff.length - 1; i++) {
                if (i < index) {
                    newStaff[i] = arrayStaff[i];
                } else {
                    newStaff[i] = arrayStaff[i + 1];
                }
            }
            arrayStaff = newStaff;
        }
    }

    public void displayStaffByIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào index bạn muốn hiển thị: ");
        int index = input.nextInt();
        if (index < 0 || index > arrayStaff.length - 1) {
            System.out.println("Vị trí vừa nhập không có trong mảng!");
        } else {
            System.out.println(arrayStaff[index]);
        }
    }

    public void displayAllStaff() {
        for (Staff elementStaff : arrayStaff) {
            System.out.println(elementStaff);
        }
    }
}
