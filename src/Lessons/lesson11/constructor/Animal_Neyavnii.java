package Lessons.lesson11.constructor;

public class Animal_Neyavnii {

    // Неявный конструктор выполняется первый, по дефолту пустой, мы его не видим
    public Animal_Neyavnii() {
        // можно оставить пустым
    }

    void sayName() {
        System.out.println("Cow");
    }

    void sayAge() {
        System.out.println(16);
    }
}
