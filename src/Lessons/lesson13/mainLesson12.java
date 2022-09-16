package Lessons.lesson13;

import Lessons.lesson13.enamExample.Car;
import Lessons.lesson13.enamExample.Country;

public class mainLesson12 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " Я выполняюсь перед continue");
            if (i > 2) {
                continue;
                /*
                Когда выполняется условие континуе, все что после континуе отбрасывается
                 */
            }
            // континуе заканчивает это действие:
            System.out.println("       " + i + " : я выполнюсь всего  два раза");
        }


//        System.out.println(Car.HONDA);

//        for (Car c : Car.values()) {
//////            System.out.println(c);
////
////            System.out.println(c.name());
//            if (c.name().equals("BMW")){
//                System.out.println("BMW существует");
//            }
//        }


    }
}
