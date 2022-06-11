package Animal;

import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap size cua mang Pet: ");
            int size = scanner.nextInt();
            animalManagement animalManagement = new animalManagement(size);
            int choice;

            //sử dụng do...while để lặp lại yêu cầu menu
            do {
                System.out.println("Menu");
                System.out.println("1. Thêm Animal");
                System.out.println("2. Hiển thị thông tin Animal");
                System.out.println("0. Thoát");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        animalManagement.addAnimal(scanner);
                        break;
                    case 2:
                        animalManagement.displayAnimal(scanner);
                        break;
                }
                System.out.println("-------------------------");
            }while (choice != 0);
        }
}

