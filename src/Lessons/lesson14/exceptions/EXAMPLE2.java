package Lessons.lesson14.exceptions;

import java.util.Scanner;

public class EXAMPLE2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();

        int[] a = {3, 4, 6};

        try {
            System.out.println(a[b] / 0);
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Недопустимый элемент массива");
        } catch (ArithmeticException w) {
            System.out.println("На ноль делить нельзя");
        }

        System.out.println("Программа продолжает свою работу");
    }
}
