package Homeworks.homework3;

import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {

        System.out.println("Введите число '1', '2' или '3': ");
        Scanner scannerNumber = new Scanner(System.in); // Объявляем сканер с переменной scannerNumber
        int numberNew = scannerNumber.nextInt(); // Объявляем переменную numberNew и метод nextInt считывающий введенное число с консоли

        // Первое условие:
        if (numberNew == 1) {
            System.out.println("Вы ввели число '1'.");
        }
        // Второе условие:
        else if (numberNew == 2) {
            System.out.println("Вы ввели число '2'.");
        }
        // Третье условие:
        else if (numberNew == 3) {
            System.out.println("Вы ввели число '3'.");
        }
        // Блок альтернативы:
        else {
            System.out.println("Вы ввели число не равное '1', '2' или '3'.");
        }

    }
}


