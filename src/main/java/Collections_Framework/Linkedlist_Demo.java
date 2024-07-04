package Collections_Framework;

import java.util.LinkedList;
/**2.Linkedlist:- LinkedList is an implemented class of List interface , It uses a Doubly linked list  internally to store elements
 * Doubly linked list means where elements (nodes) are connected through links. Each node contains data and a reference to the next node & previous node .*/
 /*Note:- there are two types of syntax 1. generic :- LinkedList <String> ll = new LinkedList <String>(); this syntax is used to restrict other data types to use it
 * if we mention "String" then there should be ONLY String related data types other datatypes are not accepted
 * 2.Normal:-LinkedList ll = new LinkedList(); here in this syntax we can give any type of data type.*/
public class Linkedlist_Demo
{
    public static void main(String[] args)
    {
        LinkedList <Integer> obj = new LinkedList<Integer>();
        obj.add(10);
    }
}
