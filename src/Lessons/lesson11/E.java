package Lessons.lesson11;

public class E {

    // Неявный
    public E() {
        System.out.println("Метод построения без параметра");
    }

    // Явный
    public E(int value) {
        System.out.println("Метод построения Е с парамтром " + value);
    }
}

class J extends E {
    public J() {
        System.out.println("J - построения без параметра");
    }

    public J(int value) {
        super(5);
        System.out.println("J - построения J с парамтром " + value);
    }
}
