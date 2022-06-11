package luyenntap;

import java.util.Scanner;

public class MenuStaff {
    int index = 0;

    Staff[] staffs = new Staff[10];

    public Staff createStaff(Scanner scanner) {
        System.out.println("name :");
        String name = scanner.nextLine();
        System.out.println("age :");
        int age = scanner.nextInt();
        System.out.println("salary:");
        double salary = scanner.nextDouble();
        return new Staff(name, age, salary);
    }

    public void addStaff(Scanner scanner){
        Staff newStaff = createStaff(scanner);
        staffs[index] = newStaff;
        index++;
    }
    public void display() {
        for (Staff element : staffs) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }
}
