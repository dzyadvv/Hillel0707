package Lessons.lesson17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        String[] a = {"красный", "синиый", "зеленый"};
        List<String> list = Arrays.asList(a);

        System.out.println(list);
        //[красный, синиый, зеленый]


        Collections.sort(list);
        System.out.println(list);
        //[зеленый, красный, синиый]

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        //[синиый, красный, зеленый]

        Collections.reverse(list);
        System.out.println(list);
        //[зеленый, красный, синиый]

        Collections.shuffle(list);
        System.out.println(list);
        //рандомно мешает


        List<Integer> list2 = Arrays.asList(1, 4, 5, 6, 8, 8, 8);
        System.out.println(Collections.max(list2)); // 8
        System.out.println(Collections.min(list2)); // 1

        System.out.println(Collections.frequency(list2, 8)); //3
        System.out.println(Collections.frequency(list2, 1)); //1
    }
}
