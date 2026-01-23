package Lab3.Task3;
import java.util.Calendar;

public class House {
    private int floors;
    private int yearBuilt;
    private String name;


    public House(){

    }


    public House(int floors, int yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }


    public void setAll(int floors, int yearBuilt, String name){

        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }


    public void printInfo() {
        System.out.println("Дом: " + name);
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год полстройки: " + yearBuilt);
    }


    public int yearsCount() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearBuilt;
    }
}


