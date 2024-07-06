package Collections_Framework;

import java.util.LinkedList;
import java.util.Queue;

/**Queue Interface:- The Queue interface, present in the java.util package, represents a collection of elements in a specific order.
 It follows the first-in, first-out (FIFO) principle, meaning that elements are recover in the order they were added to the queue.*/
public class Queue_Demo
{
    /*Key methods:
add(element): Adds an element to the rear of the queue. Throws an exception if the queue is full.
offer(element): Adds an element to the rear of the queue. Returns false if the queue is full.
remove(): Removes and returns the element at the front of the queue. Throws an exception if the queue is empty.
poll(): Removes and returns the element at the front of the queue. Returns null if the queue is empty.
element(): Returns the front element without removing it (throws an exception if empty).
peek(): Returns the front element without removing it (returns null if empty).*/
    public static void main(String[] args)
    {
        Queue q=new LinkedList();
        q.offer (10);
        q.offer (99);
        q.offer (22);
        q.offer (78);
        System. out.println (q);
        System. out.println (q.peek ());
        q.poll ();
        System. out.println (q);
        System. out.println (q.peek ());
        q.poll ();
        System. out.println (q) ;
    }
}
