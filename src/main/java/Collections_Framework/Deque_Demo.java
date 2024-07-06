package Collections_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

/**Dequeue:- he Deque (double-ended queue) interface is part of the Java Collections Framework. It extends the Queue interface and provides a flexible data structure
 * that allows elements to be added or removed from both ends. Essentially, a Deque can be used as either a queue (first-in-first-out, or FIFO) or a stack
 * (last-in-first-out, or LIFO).*/
public class Deque_Demo
{
    /*A Deque supports the following operations:
Adding elements at both ends: addFirst(), addLast() & Removing elements from both ends: removeFirst(), removeLast()
Accessing elements at both ends: getFirst(), getLast() & You can use it as a queue or a stack based on your requirements.*/
    public static void main(String[] args)
    {
        Deque D = new ArrayDeque();
        D.add(18);
        D.add(20);
        D.add(45.9F);
        D.add(13349902217795L);
        D.add("Don");
        D.addFirst(7.8);
        D.addLast(777);
        System.out.println(D);
        D.removeFirst();
        System.out.println(D);
        D.removeFirst();
        System.out.println(D);
        D.removeLast() ;
        System.out.println(D);
        D.removeLast() ;
        System.out.println(D);




    }
}
