package Lessons.lesson17;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExmpl {

    public static void main(String[] args) {

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.offer(22);
//
//        queue.remove();
//        // queue.poll();
//
//        for (int i : queue) {
//            System.out.println(i);
//        }
//
//        System.out.println(queue.element());
//        System.out.println(queue.peek());


//        Queue<String> queue = new LinkedList<>();
//        queue.add("бананы");
//        queue.add("яблоки");
//        queue.add("ананасы");
//
//        while (queue.peek() != null) {  // !queue.isEmpty()
//            //пока очередь не null выкидывает элементы из очереди
//            System.out.println(queue.poll());
//        }
//
//        System.out.println(queue.poll()); // null


//        Queue<String> queue = new PriorityQueue<>();
//        queue.add("бананы");
//        queue.add("яблоки");
//        queue.add("ананасы");
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }
//        // ананасы
//        // бананы
//        // яблоки
//
//        System.out.println(queue.poll());


        Queue<Boolean> queue = new PriorityQueue<>();

        queue.add(true);
        queue.add(false);
        queue.add(true);


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        //false
        //true
        //true


    }
}