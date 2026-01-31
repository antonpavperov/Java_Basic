package Lab4.Part2;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Part2 part2 = new Part2();

        System.out.println("= Проверка сортировки массива =");

        int[] sortedTest = {1, 2, 6, 8, 9};
        boolean sorted = part2.checkMassiveSorted(sortedTest);
        System.out.println("Проверка сортировки: " + (sorted ? "OK" : "Please, try again"));



        System.out.println("= Создание массива =");

        System.out.println("\nВведите длину массива:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] resultArray = part2.arrayMaker(array);
        System.out.println("Результат: " + Arrays.toString(resultArray));



        System.out.println("= Замена элементов массива =");

        int[] swapArray = {5, 6, 7, 2};

        System.out.println("Array 1: " + Arrays.toString(swapArray));
        part2.swapFirstLast(swapArray);
        System.out.println("Array 2: " + Arrays.toString(swapArray));


        System.out.println("= Первое уникальное число =");
        int[] testArray = {1, 2, 3, 1, 2, 4};
        part2.firstUniqueNumber(testArray);

        System.out.println("= Сортировка массива слиянием =");
        part2.mergeSortExampleSingleMethod();
    }
}
