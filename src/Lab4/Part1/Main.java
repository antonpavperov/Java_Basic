package Lab4.Part1;
import Lab4.Part1.Part1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Part1 part1 = new Part1();

        System.out.println("= Задание 1: Нечётные числа =");
        part1.oddNumbers();

        System.out.println("\n= Задание 2: Делимость на 3 и 5 =");
        part1.dividingNumbers();

        System.out.println("\n= Задание 3: Сумма двух чисел =");
        System.out.println("Введите три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean sumResult = part1.sumOfNumbers(a, b, c);
        System.out.println(sumResult);

        System.out.println("\n= Задание 4: Сравнение чисел =");
        System.out.println("\nВведите три числа для сравнения:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean compareResult = part1.sumOfNumbers(num1, num2, num3);
        System.out.println(compareResult);

        System.out.println("\n= Задание 5: Проверка элементов массива =");
        System.out.println("\nВведите размер массива:");

        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean arrayResult = part1.arrayCheck(array);
        System.out.println(arrayResult);

        System.out.println("\nВведите размер массива для задания 6:");
        int m = scanner.nextInt();
        int[] array2 = new int[m];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }

        boolean result6 = part1.arrayCheck2(array2);
        System.out.println(result6);
    }

}
