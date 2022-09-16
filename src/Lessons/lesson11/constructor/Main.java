package Lessons.lesson11.constructor;

public class Main {
    public static void main(String[] args) {
        Animal_Neyavnii animal = new Animal_Neyavnii();
        animal.sayAge();
        animal.sayName();

        Animal_Yavnii animal_yavnii = new Animal_Yavnii("Cat", 5);
        animal_yavnii.sayAge();
        animal_yavnii.sayName();

        Animal_Yavnii animal_yavnii2 = new Animal_Yavnii();
        animal_yavnii2.sayHello();
    }
}
