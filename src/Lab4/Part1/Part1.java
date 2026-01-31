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
    public boolean sumOfNumbers(int a, int b, int c){

        return a + b == c;
    }

// Задание 4
    public boolean comparingNumbers(int num1, int num2, int num3){

        return num1 < num2 && num2 < num3;

    }

// Задание 5
    public boolean arrayCheck(int[] array) {

        return array[0] == 3 || array[array.length - 1] == 3;
}


//Задание 6
    public boolean arrayCheck2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                return true;
            }
        }
        return false;
}
}
