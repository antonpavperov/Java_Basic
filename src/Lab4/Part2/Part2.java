package Lab4.Part2;
import java.util.Scanner;
import java.util.Arrays;

public class Part2 {

    Scanner scanner = new Scanner(System.in);

//задание 1
    public void checkMassiveSorted() {

        int[] array = {1, 2, 6, 8, 9};

        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

//задание 2
    public void arrayMaker(){

        System.out.println("Введите длинну массива: ");
        int n = scanner.nextInt();
        int[] array_1 = new int[n];

        for(int i = 0; i < n; i++ ){
            array_1 [i] = scanner.nextInt();
        }

        System.out.println("Результат: " + Arrays.toString(array_1));
    }

//задание 3
    public void swapFirstLast(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

//задание 4
    public void firstUniqueNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Первое уникальное число: " + array[i]);
                return;
            }
        }
        System.out.println("Уникальных чисел нет");
    }

//задание 5
public void mergeSortExampleSingleMethod() {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Введите длину массива: ");
    int n = scanner.nextInt();
    int[] array = new int[n];


    for (int i = 0; i < n; i++) {
        array[i] = (int)(Math.random() * 100);
    }

    System.out.println("Исходный массив: " + Arrays.toString(array));


    mergeSort(array, 0, array.length - 1);


    System.out.println("Отсортированный массив: " + Arrays.toString(array));
}


    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = array[left + i];
        for (int j = 0; j < n2; j++) R[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }
}




