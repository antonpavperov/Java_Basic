package Lab3.Task4;

public class Tree {
    private int age;
    private Boolean isAlive;
    private String name;


    public Tree(int age, String name){
        this.age = age;
        this.name = name;
        this.isAlive = null;
    }


    public Tree(int age, String name, boolean isAlive){
        this.age = age;
        this.name = name;
        this.isAlive = isAlive;
    }


    public Tree(){
        System.out.println("«Пустой конструктор без параметров сработал»");
        this.isAlive = null;
    }


    public void printInfo(){
        System.out.println("Название дерева: " + name);
        System.out.println("Возраст: " + age);
        if(isAlive != null){
            System.out.println("Живое ли дерево: " + isAlive);
        }
        System.out.println();
    }
}
