package Collections_Framework;

import java.util.ArrayDeque;

/**ArrayDeque:- The ArrayDeque (short for “Array Double Ended Queue”) is a versatile data structure that combines the features of both a stack and a queue.
 It allows you to add or remove elements from both ends efficiently. Here are the key points:
 ArrayDeque implements both the Queue and Deque interfaces. & You can use it as a stack or a queue based on your needs.*/
public class ArrayDeque_Demo
{
    /*Advantages of ArrayDeque:
Efficient: The ArrayDeque provides constant-time performance for inserting and removing elements from both ends. This makes it ideal for scenarios where you need frequent add and remove operations.
Resizable: It dynamically grows and shrinks as needed to accommodate elements. & Lightweight: Unlike linked lists, ArrayDeque doesn’t have additional overhead, making it memory-efficient.
Not Thread-safe: By default, it’s not thread-safe, but you can create a synchronized version using Collections.synchronizedDeque.
*/
    public static void main(String[] args)
    {
        ArrayDeque ad = new ArrayDeque();
        ad.add(42);
        ad.add(24);
        ad.add(65.9F);
        ad.add(65.9);
        ad.add(13349902217795L);
        ad.add("Ronald Rose");
        ad.addFirst(9.8);
        ad.addLast(123);
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);
        ad.removeLast() ;
        System.out.println(ad);
        ad.removeLast() ;
        System.out.println(ad);
    }
}
