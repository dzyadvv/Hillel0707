package Lessons.lesson12.staticExmple;

public class Main {
    static String name = "Murzik";

    public static void main(String[] args) {
////        Cat cat = new Cat();
////        System.out.println(cat.);
//
//        System.out.println(Cat.name); // название класса, название переменной
////        System.out.println(Cat.age); // age не статик


//        Car.myStatic += 20;
//        System.out.println(Car.myStatic); // 120
//
//        Car c1 = new Car();
//        System.out.println("Статическая переменная объекта c1 " + c1.myStatic); // 120
//        c1.nonStatic += 20;
//        System.out.println("Статическая переменная объекта c1 " + c1.nonStatic); // 20
//
//        Car c2 = new Car();
//        System.out.println("Статическая переменная объекта c2 " + c2.myStatic); // 120
//        System.out.println("Статическая переменная объекта c2 " + c2.nonStatic); // 0

        Cat.sayHello(name);

    }
}
