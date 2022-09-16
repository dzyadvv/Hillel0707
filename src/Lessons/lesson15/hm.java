package Lessons.lesson15;


public class hm {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        int[] newArr = arrExtension(array, 7);
        for (int a : newArr) {
            System.out.println(a + " ");
        }
    }

    public static int[] arrExtension(int[] arr, int number) {

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = number;
        return newArr;
    }
}

