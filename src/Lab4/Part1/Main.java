package Lab4.Part1;
import Lab4.Part1.Part1;

public class Main {
    public static void main(String[] args){
        Part1 part1 = new Part1();

        System.out.println("= Задание 1: Нечётные числа =");
        part1.oddNumbers();

        System.out.println("\n= Задание 2: Делимость на 3 и 5 =");
        part1.dividingNumbers();

        System.out.println("\n= Задание 3: Сумма двух чисел =");
        part1.sumOfNumbers();

        System.out.println("\n= Задание 4: Сравнение чисел =");
        part1.comparingNumbers();

        System.out.println("\n= Задание 5: Проверка элементов массива =");
        part1.arrayChek();

        System.out.println("\n= Задание 6: Проверка элементов массива 2 =");
        part1.arrayChek2();
    }

}
