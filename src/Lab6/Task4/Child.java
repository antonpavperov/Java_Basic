package Lab6.Task4;

public class Child extends Parent {

    public Child(int number) {
        super(number);
    }

    public void printNumber() {
        System.out.println("Число из родительского класса: " + number);
    }
}