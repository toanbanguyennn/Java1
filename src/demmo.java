import java.util.Scanner;


public class demmo {
    public static void main(String[] args) {
        //cách nhập vào giá trị từ console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 từ bất kỳ: ");
        String welcome = scanner.nextLine();
        System.out.println(welcome);
        System.out.println("Nhập vào 1 số bất kỳ: ");
        int number = scanner.nextInt();
        System.out.println(number);
        //in trong cùng 1 dòng" print
        // \n để xuống dòng trong 1 chuỗi string
        System.out.print("HelloWorld\n");
        //in xong thì xuống dòng: println
        System.out.println("+CodeGym");
        boolean check = true;

        //string, char, byte, short, int, long, float, double, boolean
        //bit: 1 0
        char a = 'a';
        String b = "a";

        //khai báo mảng literal
        int [] arr = {1,2,3};
        //khai báo mảng rỗng
        int [] array = new int[]{};
        //khai báo mảng với số lượng phần tử trong mảng
        int [] array1 = new int[3];
        //khai báo mảng với các phần tử cụ thể
        int [] array2 = new int[]{50,45, 40};

        //duyệt mảng sử dụng forEach
        for (int element : array2) {
            System.out.println("Phần tử của array2: " + element);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        int[] arrayNew = new int[array1.length*2];
        System.out.println(array1.length);
        System.out.println(arrayNew.length);

        array1[2] = 100;
        System.out.println(array1[2]);
//        array1[10] = 10;
//        System.out.println(array1[10]);
    }

    //phương thức không giá trị trả về: void
    public static void demo(int a, int[] b) {
//        a[0] = 1;
        b[0] = 10;
    }

    //phương thức có giá trị trả về: datatype return
    public static double demo1() {
        return 0.1;

    }
}
