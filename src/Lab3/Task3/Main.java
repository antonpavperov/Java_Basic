package Lab3.Task3;

public class Main {
    public static void main(String[] args) {
        // Первый объект — через пустой конструктор
        House house1 = new House();
        house1.setAll(5, 2000, "Угловой");

        // Второй объект — через конструктор с параметрами
        House house2 = new House(10, 2010, "Князя Орлова");

        // Вывод информации
        house1.printInfo();
        System.out.println();
        house2.printInfo();
    }
}