package Homeworks.homework5;

import java.util.Arrays;

public class dz9 {
    public static void main(String[] args) {

        /* С помощью цикла в цикле необходимо создать
         * * * * *
         * * * * *
         * * * * *
         */

        // Первый вариант
        char[][] stars = {{'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}}; // создаем и объявляем содержимое массива
        for (int lines = 0; lines < stars.length; lines++) { // создаем строки
            for (int columns = 0; columns < stars[lines].length; columns++) { // создаем столбцы
                System.out.print(stars[lines][columns] + " "); // выводим элементы
            }
            System.out.println(); // перенос строки для создания табличной формы
        }

        System.out.println("-------------------------");

        // Второй вариант
        for (int i = 0; i < 3; i++) { // создаем строки
            for (int j = 0; j < 5; j++) { // создаем столбцы
                System.out.print("* "); // выводим элементы
            }
            System.out.println(); // перенос строки для создания табличной формы
        }
    }
}
