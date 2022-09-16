package Lessons.lesson11.constructor;

public class Animal_Yavnii {

    // Неявный конструктор без значений (sayHello())
    public Animal_Yavnii() {

    }

    // Явный конструктор передает значения (Animal_Yavnii(String name, int age))
    public Animal_Yavnii(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    void sayName() {
        System.out.println(name);
    }

    void sayAge() {
        System.out.println(age);
    }

    void sayHello() {
        System.out.println("Hello");
    }

}
