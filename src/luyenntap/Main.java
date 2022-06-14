package luyenntap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaffManager staffManager = new StaffManager();

        //tạo ra 1 mảng chứa các Staff với length tương ứng
        staffManager.createArrayStaff();

        //lấy ra độ dài mảng StaffArray sau khi tạo
        int staffArrayLength = staffManager.getArrayStaff().length;

        //tạo hết đối tượng trong mảng
        for (int i = 0; i < staffArrayLength; i++) {
            Staff objectStaff = staffManager.createNewStaff();
            staffManager.addStaffInArrayStaff(objectStaff);
        }

        //dùng để hiện thị các object tồn tại trong mảng trước khi xóa
        System.out.println("Các staff trước khi xóa ở vị trí index thứ 3: ");
        staffManager.displayAllStaff();

        //xóa Staff tại vị trí nhập vào
        staffManager.deleteStaffByIndexInArray();

        //dùng để hiện thị các object tồn tại trong mảng sau khi xóa
        System.out.println("Các staff sau khi xóa ở vị trí index thứ 3: ");
        staffManager.displayAllStaff();

        //hiển thị Staff tại vị trí nhập vào
        System.out.println("Hiển thị Staff theo vị trí index: ");
        staffManager.displayStaffByIndex();

        //sửa thông tin của Staff tại vị trí nhập vào
        staffManager.updateStaffByIndex();

        //hiển thị lại sau cập nhật
        System.out.println("Hiển thị tất cả Staff: ");
        staffManager.displayAllStaff();
    }
}
