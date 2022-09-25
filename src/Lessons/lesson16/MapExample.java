package Lessons.lesson16;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("Alex", "24.07.1989");
        myHashMap.put("Sasha", "2.09.1999");
        myHashMap.put("Dima", "4.03.1979");

        System.out.println("Do we have Alex? - " + myHashMap.containsKey("Alex"));
        // true
        System.out.println("Do we have Ira? - " + myHashMap.containsKey("Ira"));
        // false

        System.out.println("Do we have 24.07.1989? - " + myHashMap.containsValue("24.07.1989"));
        //true


//        String str = "Do we have Alex? : ";
//
//        if (myHashMap.containsKey("Alex")) {
//            System.out.println(str.concat("Да"));
//        } else {
//            System.out.println(str.concat("Нет"));
//        }
//
//        System.out.println(myHashMap.containsKey("Alex") ? str.concat("Yes") : str.concat("No"));


//        System.out.println("Value for key Alex - " + myHashMap.get("Alex"));
//        //Value for key Alex - 24.07.1989


//        System.out.println("Map before deleting ");
//        for (Map.Entry<String, String> i : myHashMap.entrySet()) {
//            System.out.println(i.getKey() + " - " + i.getValue());
//            // Alex - 24.07.1989
//            // Sasha - 2.09.1999
//            // Dima - 4.03.1979
//        }
//
//        myHashMap.remove("Dima");
//
//        System.out.println("Map after deleting ");
//        for (Map.Entry<String, String> i : myHashMap.entrySet()) {
//            System.out.println(i.getKey() + " - " + i.getValue());
//            // Alex - 24.07.1989
//            // Sasha - 2.09.1999
//        }

        System.out.println(myHashMap.size());

    }
}
