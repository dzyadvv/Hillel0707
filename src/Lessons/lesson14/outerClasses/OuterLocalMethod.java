package Lessons.lesson14.outerClasses;

public class OuterLocalMethod {

    void my_Method() {
        int num = 888;

        // Класс внутри метода
        class MethodInner_Demo {
            // Локальный метод внутреннего класса
            void print() {
                System.out.println("Это метод внутреннего класса" + num);
            }
        }


        MethodInner_Demo methodInner_demo = new MethodInner_Demo();
        methodInner_demo.print();
    }
}
