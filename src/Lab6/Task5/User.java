package Lab6.Task5;

class User extends Person {

    public String getName() {
        System.out.print("Введите имя: ");
        return scanner.next();
    }

    @Override
    public int getAge() {
        System.out.print("Введите возраст пользователя: ");
        return scanner.nextInt();
    }
}
