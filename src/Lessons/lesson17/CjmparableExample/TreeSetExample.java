package Lessons.lesson17.CjmparableExample;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        CarComparator carComparator = new CarComparator();
        TreeSet<Car> cars = new TreeSet<Car>(carComparator);

        cars.add(new Car("BMW", 23));
        cars.add(new Car("HONDA", 5));
        cars.add(new Car("TOYOTA", 4));
        cars.add(new Car("TESLA", 7));

        for (Object car : cars) {
            System.out.println(car);
//            TOYOTA 4
//            HONDA 5
//            TESLA 7
//            BMW 23
        }
    }
}


//    public static void main(String[] args) {
//        TreeSet<Car> cars = new TreeSet<Car>();
//
//        cars.add(new Car("BMW", 23));
//        cars.add(new Car("HONDA", 5));
//        cars.add(new Car("TOYOTA", 4));
//        cars.add(new Car("TESLA", 7));
//
//        for (Object car : cars) {
//            System.out.println(car);
//            //Car{year=23}
//            // Car{year=5}
//            // Car{year=4}
//            // Car{year=7}
//        }
//    }
//}