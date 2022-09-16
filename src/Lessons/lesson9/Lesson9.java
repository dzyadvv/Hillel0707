package Lessons.lesson9;

public class Lesson9 {
    public static void main(String[] args) {
        int[] array = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int temp;
        while (!isSorted) { // пока false выполняем цикл
            isSorted = true; // переключаем на true
            for (int i = 0; i < array.length - 1; i++) { // 3 раза
                if (array[i] > array[i + 1]) { // если 11 > 3
                    isSorted = false; // то переключаем на false

                    temp = array[i]; // temp = 11
                    array[i] = array[i + 1]; // array[0] = array[1] ->  11 = 3
                    array[i + 1] = temp;  // array[1] == temp
                }
            }
        }

        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }
}
