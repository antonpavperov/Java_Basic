package Lab6.Task5;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        String name = user.getName();
        int age = user.getAge();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
