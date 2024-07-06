package Collections_Framework;
/**2.Linkedlist:- LinkedList is an implemented class of List interface , It uses a Doubly linked list  internally to store elements
 * Doubly linked list means where elements (nodes) are connected through links. Each node contains data and a reference to the next node & previous node .*/
/*Note:- there are two types of syntax 1. generic :- LinkedList <String> ll = new LinkedList <String>(); this syntax is used to restrict other data types to use it
 * if we mention "String" then there should be ONLY String related data types other datatypes are not accepted
 * 2.Normal:-LinkedList ll = new LinkedList(); here in this syntax we can give any type of data type.*/
import java.util.LinkedList;

public class Linkedlist_Demo
{
    /*1. LinkedList follows the Insertion Order. * 2. stores data index based * 3. It can store duplicate value
    * 4. It's underline data structure is Doubly linked list or Circular linked list & * 5. It's not Synchronized*/

    public static void main(String[] args)
    {
        LinkedList obj = new LinkedList();
        obj.add(true);
        obj.add(12);
        obj.add(99.5);
        System.out.println(obj);
        System.out.println(obj.indexOf(99.5));
    }
}
