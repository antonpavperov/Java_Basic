package Lab4.Part2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Part2 part2 = new Part2();

        System.out.println("= Проверка сортировки массива =");
        part2.checkMassiveSorted();

        System.out.println("= Создание массива =");
        part2.arrayMaker();

        System.out.println("= Замена элементов массива =");

        int[] array = {5, 6, 7, 2};

        System.out.println("Array 1: " + Arrays.toString(array));
        part2.swapFirstLast(array);
        System.out.println("Array 2: " + Arrays.toString(array));


        System.out.println("= Первое уникальное число =");
        int[] testArray = {1, 2, 3, 1, 2, 4};
        part2.firstUniqueNumber(testArray);

        System.out.println("= Сортировка массива слиянием =");
        part2.mergeSortExampleSingleMethod();

    }


}
