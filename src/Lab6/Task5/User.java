package Lab6.Task5;

class User extends Person {

    @Override
    public String getName() {
        System.out.print("Введите имя: ");
        return scanner.next();
    }
}
