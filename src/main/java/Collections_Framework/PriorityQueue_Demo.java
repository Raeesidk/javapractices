package Collections_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;

/**PriorityQueue:- A Priority Queue is a data structure where elements are ordered by priority.
 Unlike a regular queue (which follows the first-in-first-out principle), a priority queue processes elements based on their priority.
 The highest-priority elements appear at the front of the queue.*/
public class PriorityQueue_Demo
{ /*Smallest data to largest data
Largest to smallest data removal can be done by using--->"Comparator.reverseOrder()" type in Constructor */
    public static void main(String[] args)
    {
        PriorityQueue pq = new PriorityQueue(Comparator.reverseOrder());
        pq.offer (10);
        pq.offer (99);
        pq.offer (22);
        pq.offer (78);
        System. out.println (pq);
        System. out.println (pq.peek ());
        pq.poll ();
        System. out.println (pq);
        System. out.println (pq.peek ());
        pq.poll ();
        System. out.println (pq) ;
    }
}
