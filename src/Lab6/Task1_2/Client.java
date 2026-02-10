package Lab6.Task1_2;

public class Client extends Human implements Printable {

    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printAllInfo() {
        System.out.println("Клиент: " + firstName + " " + lastName +
                ", банк: " + bankName);
    }
}