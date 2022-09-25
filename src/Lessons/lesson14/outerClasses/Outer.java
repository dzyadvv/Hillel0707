package Lessons.lesson14.outerClasses;

public class Outer {

    int num;

    private class InnerDemo {
        public void print() {
            System.out.println("Это внутренний класс");
        }
    }

    void displayInner() {
        InnerDemo innerDemo = new InnerDemo();
        innerDemo.print();
    }

}
