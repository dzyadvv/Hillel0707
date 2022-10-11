package Lessons.lesson17.CjmparableExample;


public class Car {

    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return model + " " + this.year;
    }
}


//public class Car implements Comparable<Car> {
//
//    String model;
//    int year;
//
//    public Car(String model, int year) {
//        this.model = model;
//        this.year = year;
//    }
//
//    @Override
//    public String toString() {
//        return model + " " + this.year;
//    }
//
//    @Override
//    public int compareTo(Car o) {
//        return this.model.compareTo(String.valueOf(o));
//    }
////    BMW 23
////    HONDA 5
////    TESLA 7
////    TOYOTA 4
//
//    //    public Car(int year) {
////        this.year = year;
////    }
////
////    @Override
////    public String toString() {
////        return "Car{" + "year=" + year + '}';
////    }
////
////
////
////    @Override
////    public int compareTo(Car o) {
////        if (this.year == o.year) {
////            return 0;
////        } else if (this.year < o.year) {
////            return -1;
////        } else {
////            return 1;
////        }
////        //Car{year=4}
////        // Car{year=5}
////        // Car{year=7}
////        // Car{year=23}
//
//
//    ////    @Override
//////    public int compareTo(Car o) {
//////        return 1; // если -1, то перевернет
////    // }
//
//}

