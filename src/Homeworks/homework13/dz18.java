package Homeworks.homework13;

public class dz18 {
    /*
    Написать программу, которая будет заменять все четные элементы массива на 0 и выводить результат в консоль!
    Массив от 1 до 10!
     */

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                numbers[i] = 0;
            }
            System.out.print(numbers[i] + " ");
        }
    }
}
