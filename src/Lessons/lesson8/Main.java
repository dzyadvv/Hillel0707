package Lessons.lesson8;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(); // создание объекта Cat или создание экземпляра класса
        cat.sayHello();
        catAction();

    }

    public static void catAction() {
        Cat cat1 = new Cat();
        cat1.jump();
        cat1.run();
    }

    /*
    Принципы ООП:
    Наследование
    Полиморфизм
    Инкапсуляция
     */

}
