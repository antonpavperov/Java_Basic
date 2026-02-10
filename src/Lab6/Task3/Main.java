package Lab6.Task3;



public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck(
                8000,
                "Volvo",
                'B',
                90.5f,
                6,
                20000
        );

        truck.outPut();
        truck.newWheels(8);

        System.out.println("Максимальный вес: " + truck.maxWeight);
    }
}
