package Homeworks.homework4;

public class dz7 {
    public static void main(String[] args) {

        /* Необходимо вывести на экран таблицу умножения на 3 с помощью цикла for */

        System.out.println("Таблица умножения на '3':");

        int multiplier1 = 3; // объявляем переменную равную '3' которую будем умножать

        for (int multiplier2 = 1; multiplier2 <= 10; multiplier2++) { // цикл For (инициализация, условие, инкрементация)
            int result = multiplier1 * multiplier2; // результат умножения первой переменной на измененную переменную
            System.out.println(multiplier1 + "*" + multiplier2 + "=" + result); // будет выполняться пока цикл не закончит условие
        }
    }
}
