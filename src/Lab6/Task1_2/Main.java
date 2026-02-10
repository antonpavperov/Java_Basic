package Lab6.Task1_2;

public class Main {
    public static void main(String[] args) {

        Printable[] people = new Printable[3];

        people[0] = new Client("Иван", "Иванов", "Сбербанк");
        people[1] = new BankWorker("Мария", "Петрова", "ВТБ");
        people[2] = new Client("Алексей", "Смирнов", "Альфа-Банк");

        for (Printable person : people) {
            person.printAllInfo();
        }
    }
}
