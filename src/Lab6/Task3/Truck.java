package Lab6.Task3;

public class Truck extends Car {

    public int wheels;
    public int maxWeight;


    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }


    public void newWheels(int wheels) {
        this.wheels = wheels;
        System.out.println("Новое количество колёс: " + this.wheels);
    }
}
