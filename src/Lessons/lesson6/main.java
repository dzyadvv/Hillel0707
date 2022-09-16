package Lessons.lesson6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String text = "Hello i am Maks";

        if (text.equals("Hello i am Maks")) { // идентичность текста
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }

        if (text.equalsIgnoreCase("Hello i am Maks")) { // иден-ность текста без учета регистра
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }


        String text2 = "Hello i am Alex";
        System.out.println(text2.indexOf("l")); // индекс
        System.out.println(text2.lastIndexOf("l"));


        int num = 123456789;
        String temp = String.valueOf(num); // из инт в стринг
        System.out.println(temp);


        String num2 = "45687";
        int temp2 = Integer.parseInt(num2); // из стринг в инт
        System.out.println(temp2);


        double num3 = 5.75;
        System.out.println(Math.round(num3)); // округ до ближайшей целой
        System.out.println(Math.floor(num3)); // дабл 5,0
        System.out.println(Math.ceil(num3)); // до верхнего числа дабл


//        String[] myarr = {"Привет", "меня", "зовут", "Макс"};
//        // 0 1 2 3
//        // 3 2 1 0
//        // Макс зовут меня Привет
//        reverseArray(myarr);
//
//        countWords();


    }

    public static void reverseArray(String[] arr) {
        int lengthArr = arr.length; // длина массива
        String temp; // 1ит = ноль,

        //[n - i - 1] , n - длина массива, i - иттератор
        // n/2

        for (int i = 0; i < lengthArr / 2; i++) {
            temp = arr[lengthArr - i - 1]; // 1ит = arr[3] = Макс
            arr[lengthArr - i - 1] = arr[i]; // arr[0] = Привет {"Привет", "меня", "зовут", "Привет"}
            arr[i] = temp; //arr[0]  {"Макс", "меня", "зовут", "Привет"}
        }
        for (String str : arr) {
            System.out.print(str + " ");
        }

    }

    public static void countWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую фразу:");

        String input = scanner.nextLine();

        int count = 0;

        if (input.length() != 0) {
            count++;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}
