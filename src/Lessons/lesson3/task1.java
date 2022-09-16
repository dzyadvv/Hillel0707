package Lessons.lesson3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.println("Введите два целых числа: ");
        Scanner scannerNumber = new Scanner(System.in);
        int number1 = scannerNumber.nextInt();
        int number2 = scannerNumber.nextInt();
        int result = number1 + number2; // Сумма введенных переменных

        System.out.println("Введите имя: ");
        Scanner scannerName = new Scanner(System.in);
        String name1 = scannerName.nextLine();

        System.out.println("Результат: " + name1 + " " + result);

    }
}
