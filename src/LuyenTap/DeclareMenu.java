package LuyenTap;

import java.util.Scanner;

public class DeclareMenu {
        public static void main(String[] args) {
            StudentManager studentManager = new StudentManager();
            Scanner scanner = new Scanner(System.in);
            int choice;
            //sử dụng do...while để lặp lại yêu cầu menu
            do {
                System.out.println("-------Menu-------");
                System.out.println("1. Add Student");
                System.out.println("2. Update Student by id");
                System.out.println("3. Delete Student by id");
                System.out.println("4. Display all Student");
                System.out.println("5. Display Student by id");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        studentManager.addStudent(scanner);
                        break;
                    case 2:
                        displayEdit(studentManager, scanner);
                        break;
                    case 3:
                        displayDelete(studentManager, scanner);
                        break;
                    case 4:
                        studentManager.display();
                        break;
                    case 5:
                        displayOneStudent(studentManager, scanner);
                        break;
                }
                System.out.println("-------------------------");
            } while (choice != 0);
        }

    private static void displayOneStudent(StudentManager studentManager, Scanner scanner) {
        System.out.println("Enter id of Student you want to display: ");
        int displayID = scanner.nextInt();
        if (!studentManager.displayOne(displayID)) {
            System.out.println("Dose not exist Student have id: " + displayID);
        }
    }
        private static void displayEdit(StudentManager studentManager, Scanner scanner) {
            System.out.println("Enter id of Student you want to update: ");
            int editID = scanner.nextInt();
            boolean checkEdit = studentManager.updateStudent(editID, scanner);
            if (checkEdit) {
                System.out.println("Update successfully Student have id: " + editID);
            } else {
                System.out.println("Dose not exist Student have id: " + editID);
            }
        }
        private static void displayDelete(StudentManager studentManager, Scanner scanner) {
            System.out.println("Enter id of Student you want to delete: ");
            int deleteId = scanner.nextInt();
            boolean checkDelete = studentManager.deleteStudent(deleteId);
            if (checkDelete) {
                System.out.println("Delete successfully Student have id: " + deleteId);
            } else {
                System.out.println("Dose not exist Student have id: " + deleteId);
            }
        }
}
