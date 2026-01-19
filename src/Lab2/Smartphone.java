package Lab2;

public class Smartphone {

    private String brand;
    String model;
    int memory;


    public Smartphone(){
    }


    public Smartphone(String brand, String model, int memory){
        this.brand = brand;
        this.model = model;
        this.memory = memory;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public int getMemory() {
        return memory;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                '}';
    }
}
