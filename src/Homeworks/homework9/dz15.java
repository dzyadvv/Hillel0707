package Homeworks.homework9;

public class dz15 {

    /* int[] array = {11, 3, 1, 14, 7};
    Написать метод сортировки массива от большего к меньшему */

    public static void main(String[] args) {

        int[] array = {11, 3, 1, 14, 7};

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }
}
