package Lessons.lesson14.initialBlock;

public class Dog {

    // Объявляем поля:
    private String name;
    private String poroda;
    private int age;

    // Инициализируем поля в блоке инициализации:
    {
        name = "Шарик";
        poroda = "Овчарка";
        age = 2;
        System.out.println("Это нестатический блок инициализации");
    }

    public Dog(String name, String poroda, int age) {
        System.out.println("i am here");
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }

    public Dog() {
    }


}
