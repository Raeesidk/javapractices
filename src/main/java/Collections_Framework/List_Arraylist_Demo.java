package Collections_Framework;
/*List Interface:-It is a Child interface of parent interface Collection, provides a way to store an ordered collection of objects & It can have Duplicates
* Ordered Collection:A List allows you to store elements in a specific order.It preserves the insertion order, meaning the elements are stored in the order they were added.
You can access elements by their position (index) within the list.  */

import java.util.ArrayList;
import java.util.List;

/**The List interface is implemented by several classes, including: - ArrayList: A dynamic array-based implementation.
 LinkedList: A doubly-linked list implementation. & Vector: An older synchronized implementation (deprecated since Java 5).
 NOTE:- 1.List fallows insertion order, 2.Stores the data  in index based, 3.It can store Duplicate value*/
public class List_Arraylist_Demo
/*1.ArrayList:-In Java, an ArrayList is a dynamic array that can grow or shrink in size. Unlike built-in arrays, you can add or remove elements from an ArrayList without creating a new one.
* 1. ArrayList follows the Insertion Order.  2. stores data index based   3. It can store duplicate value
4. It's underline data structure is Growable and Resizable     &    5. It's not Synchronized.The elements stored in the ArrayList class can be randomly accessed.*/
{
    public static void main (String [] args) {
        ArrayList al =new ArrayList();
        al.add (10);
        al.add(10.2);
        al.add ("Jyoti");
        al.add (865565);
        al.add (20);
        al.add (true);
        al.add (20);
        al.add (true);
      System. out.println (al) ;
        System.out.println(al.indexOf(865565));

    }
}
