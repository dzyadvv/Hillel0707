package Homeworks.homework11;

import java.util.Arrays;
import java.util.Scanner;

public class dz16v2 {
    /* Написать программу калькулятор (для двух целых чисел)
    Метод int getInt() - должен считывать с консоли целое число и возвращать его
    Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
    Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
    Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат
    */

    public static void main(String[] args) {
        int num1 = getInt();
        char operation = getOperation();
        int num2 = getInt();
        System.out.print("Результат: " + calc(num1, num2, operation));
    }

    // Метод int getInt() считывает с консоли целое число и возвращает его
    public static int getInt() {
        Scanner scanNumber = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        while (!scanNumber.hasNextInt()) {
            System.out.print("Вы ввели некорректное значение. Введите целое число: ");
            scanNumber.next();
        }
        return scanNumber.nextInt();
    }

    // Метод char getOperation() считывает с консоли '+', '-', '*' или '/' и возвращает символ с операцией
    public static char getOperation() {
        Scanner scanOperation = new Scanner(System.in);
        String[] operators = {"+", "-", "*", "/"};
        System.out.print("Введите арефметическую операцию (+, -, * или /): ");
        while (!scanOperation.hasNext(Arrays.toString(operators))) {
            System.out.print("Вы ввели некорректное значение. Введите арефметическую операцию (+, -, * или /): ");
            scanOperation.next();
        }
        return scanOperation.next().charAt(0);
    }

    // Метод int calc() выполняет арифметическую операцию над числами num1 и num2, заданную operation
    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Нельзя делить на ноль.");
                //              System.exit(0);
            }
        }
        return result;
    }
}