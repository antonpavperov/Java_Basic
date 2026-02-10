package Lab6.Task1_2;

public class BankWorker extends Human implements Printable {

    private String bankName;

    public BankWorker(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printAllInfo() {
        System.out.println("Работник банка: " + firstName + " " + lastName +
                ", банк: " + bankName);
    }
}
