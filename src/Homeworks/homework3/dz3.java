package Homeworks.homework3;

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {

        System.out.println("Введите число '1': ");
        Scanner scannerNumber = new Scanner(System.in); // Объявляем класс Scanner и переменную scannerNumber
        int numberNew = scannerNumber.nextInt(); // Объявляем переменную и метод nextInt для считывания целого числа с консоли

        // Условие:
        if (numberNew == 1) {
            System.out.println("Вы ввели число '1'.");
        // Блок альтернативы:
        } else {
            System.out.println("Вы ввели число не равное '1'.");
        }
    }
}
