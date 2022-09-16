package Homeworks.homework5;

import static java.lang.Math.*;

public class dz8 {
    public static void main(String[] args) {
        // Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.

        minValueV1(7, 3);

        minValueV2(7, 3);

    }

    static void minValueV1(int number1, int number2) {
        System.out.println("Минимальное число: " + min(number1, number2));
    }

    static void minValueV2(int number3, int number4) {
        if (number3 < number4) {
            System.out.println("Минимальное число: " + number3);
        } else {
            System.out.println("Минимальное число: " + number4);
        }
    }
}
