package LuyenTap;

import java.util.Scanner;

public class StudentManager {
    //tạo mảng để chứa các Student tạo ra
    private Student[] students = new Student[]{};

    public StudentManager() {
    }

    //phương thức thêm Student: tạo mảng mới có độ dài + 1 để chứa mảng cũ và Student vừa tạo
    public void addStudent(Scanner scanner) {
        Student student = createStudent(scanner);
        Student[] studentArray = new Student[this.students.length + 1];
        System.arraycopy(this.students, 0, studentArray, 0, students.length);
        studentArray[studentArray.length - 1] = student;
        this.students = studentArray;
    }

    //phương thức trả về 1 đối tượng Student để sử dụng
    private Student createStudent(Scanner scanner) {
        System.out.println("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter gender: ");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.println("Enter average point: ");
        double avg = scanner.nextDouble();
        return new Student(name, age, gender, avg);
    }

    //trả về vị trí của đối tương Student có id tương ứng
    //nếu không có thì trả về -1
    public int checkId(int id) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    //phương thức xóa Student khỏi mảng: tạo mảng mới ít hơn 1 phần tử
    public boolean deleteStudent(int id) {
        if (this.checkId(id) != -1) {
            Student[] studentArray = new Student[this.students.length - 1];
            for (int i = 0; i < this.students.length; i++) {
                if (i < this.checkId(id)) {
                    studentArray[i] = students[i];
                } else if (i > this.checkId(id)) {
                    studentArray[i - 1] = students[i];
                }
            }
            students = studentArray;
            return true;
        }
        return false;
    }

    //phương thức cập nhật thông tin Student nếu có
    public boolean updateStudent(int id, Scanner scanner) {
        if (this.checkId(id) != -1) {
            this.students[this.checkId(id)] = editStudent(this.students[this.checkId(id)], scanner);
            return true;
        }
        return false;
    }

    //phương thức trả về 1 đối tương Student sử dụng cho phương thức edit
    //trong phương thức chứa phần check null
    private Student editStudent(Student student, Scanner scanner) {
        System.out.println("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (name.equals("")) {
            name = student.getName();
        }
        System.out.println("Enter age: ");
        int age;
        String ageString = scanner.nextLine();
        if (ageString.equals("")) {
            age = student.getAge();
        } else {
            age = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        if (gender.equals("")) {
            gender = student.getGender();
        }
        System.out.println("Enter average point: ");
        double avg;
        String avgString = scanner.nextLine();
        if (avgString.equals("")) {
            avg = student.getAveragePoint();
        } else {
            avg = Double.parseDouble(scanner.nextLine());
        }
        return new Student(student.getId(), name, age, gender, avg);
    }

    //phương thức hiển thị tất cả Student hiện có
    public void display() {
        if (students.length == 0) {
            System.out.println("There is no Student in the array");
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //phương thức hiển thị Student theo id
    public boolean displayOne(int id) {
        if (this.checkId(id) != -1) {
            System.out.println(students[this.checkId(id)]);
            return true;
        }
        return false;
    }
}