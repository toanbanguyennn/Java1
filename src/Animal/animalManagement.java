package Animal;

import java.util.Scanner;

public class animalManagement{
        public Animal[] animals= new Animal[]{};
        public int index = 0;
        public animalManagement(int size) {
            animals = new Animal[size];
        }
        public void addAnimal(Scanner scanner) {
            Animal animal = createAnimal(scanner);
            animals[index] = animal;
            index++;
        }
        public Animal createAnimal(Scanner scanner) {
            System.out.println("Nhap chieu cao pet ");
            int weight = scanner.nextInt();
            System.out.println("Nhap can nang pet ");
            int height = scanner.nextInt();
            System.out.println("Nhap gioi tinh pet ");
            scanner.nextLine();
            String gender = scanner.nextLine();
            System.out.println("Nhap mau long pet: ");
            String color = scanner.nextLine();
            return new Animal(weight,height, gender, color);
        }

        public void displayAnimal(){
            for (Animal animal : animals) {
                if (animal != null) {
                    System.out.println(animal);
                }
            }
        }
}
