package Lab6.Task5;

import java.util.Scanner;

class Person {

    protected static Scanner scanner = new Scanner(System.in);

    public int getAge() {
        System.out.print("Введите возраст: ");
        return scanner.nextInt();
    }
}
