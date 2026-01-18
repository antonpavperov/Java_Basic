package Lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        //задание 1
        System.out.println("Я\n" +
                "хорошо\n" +
                "знаю\n" +
                "Java.\n");
        //задание 2
        System.out.println((46 + 10) * (10 / 3));
        System.out.println((29) * (4) * (-15));

        //задание 3
        int number = 10500;
        System.out.println((number / 10) / 10);

        //задание 4
        double a1 = 3.6;
        double b1 = 4.1;
        double c1 = 4.9;
        System.out.println(a1 * b1 * c1);

        //задание 5
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //задание 6
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        }
    }
}
