package Homeworks.homework7;

public class dz13 {
    public static void main(String[] args) {
        /* Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
        Вывести среднее арифметическое.
         */

        int[] array = new int[10]; // создаем массив из 10 элементов
        double sumArray = 0; // переменная в которую будем считать сумму эллементов массива
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 12 + 9); // заполняем случайными числами [10, 20] - (Math.random() * (21 - 9)) + 9 = Math.random() * 12 + 9
            System.out.print(array[i] + " "); // Содержимое массива
            sumArray += array[i]; // сумма элементов массива
        }
        System.out.println();
        double average = sumArray / array.length; // среднеарефметическое значение элементов массива
        System.out.println("Среднее арефметическое: " + average);
    }

}