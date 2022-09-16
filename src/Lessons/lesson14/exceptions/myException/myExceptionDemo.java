package Lessons.lesson14.exceptions.myException;

public class myExceptionDemo {

    public static void main(String[] args) {
        try {
            compute(9);
            compute(11);
        } catch (myException e) {
            System.err.print("Перехваченное исключение " + e);
        }
        System.out.println();
        System.out.println("Дальнейший ход выполнения в main");
    }

    public static void compute(int a) throws myException {
        System.out.println("Вызван метод compute с цифрой " + a);
        if (a > 10) {
            throw new myException(a, "trouble here");
        }
        System.out.println("Нормальное завершение программы");
    }
}
