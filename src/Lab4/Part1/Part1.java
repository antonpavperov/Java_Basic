package Lab4.Part1;
import java.util.Scanner;


public class Part1 {
    Scanner scanner = new Scanner(System.in);

//Задание 1
    public void oddNumbers(){

        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0)
                    System.out.println(i);
        }
    }

//Задание 2
    public void dividingNumbers(){

        for (int i = 1; i <= 100; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("Делится на 3 и на 5: " + i);}
            else if (i % 5 == 0){
                System.out.println("Делится на 5: " + i);}
            else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);}
        }
    }

// Задание 3
    public void sumOfNumbers(){

        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();

        if(a + b == c){
            System.out.println("true");
        }
    }

// Задание 4
    public void comparingNumbers(){

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int num3 = scanner.nextInt();

        if(num2 > num1 && num3 > num2){
            System.out.println("true");
        }
    }

// Задание 5
    public void arrayChek(){
        int[] array = {1, -3, 7, 4, 5, 4, 3};

        if (array.length >= 2) {
            if (array[0] == 3 || array[array.length - 1] == 3) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("Массив слишком короткий");
        }
    }

//Задание 6
    public void arrayChek2(){
        int[] array2 = {5, 2, 7, 3, 8};
        boolean found = false;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == 1 || array2[i] == 3) {
                found = true;
                break;
            }
        }
    }
}
