package Lab2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        runCalculator();
    }


    public static void runCalculator(){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Выберите операцию (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        double result;


        if (operation.equals("+")) {
            result = add(number1,number2);
        } else if (operation.equals("-")) {
            result = minus(number1, number2);
        } else if (operation.equals("*")) {
            result = multiply(number1, number2);
        } else if (operation.equals("/")) {
            result = division(number1,number2);
        } else {System.out.println("Неизвестная операция");
            return;
        }


        System.out.println("Результат: " + result);
        scanner.close();


    }

    // умножение
    public static int multiply(int number1, int number2){
        return number1 * number2;
    }


    public static long multiply(long number1, long number2){
        return number1 * number2;
    }


    public static double multiply(double number1, double number2){
        return number1 * number2;
    }


    //сложение
    public static int add(int number1, int number2){
        return number1 + number2;
    }


    public static long add(long number1, long number2){
        return number1 + number2;
    }


    public static double add(double number1, double number2){
        return number1 + number2;
    }

    //вычитание
    public static int minus(int number1, int number2){
        return number1 - number2;
    }


    public static long minus(long number1, long number2){
        return number1 - number2;
    }


    public static double minus(double number1, double number2) {
        return number1 - number2;
    }


    //деление
    public static int division(int number1, int number2){
        return number1 / number2;
    }


    public static long division(long number1, long number2){
        return number1 / number2;
    }


    public static double division(double number1, double number2){
        return number1 / number2;
    }



}