package Collections_Framework;

import java.util.HashSet;
import java.util.Set;
//                                                                     IT IS SIMILAR TO SET ONLY
/**HashSet:- Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSetclass and implements Set interface.
 HashSet stores the elements by using a mechanism called hashing. HashSet contains unique elements only.
 HashSet allows null value. HashSet class is non synchronized. HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.*/
public class HashSet_Demo
{
    public static void main(String[] args)
    {
        HashSet hs = new HashSet();
        hs.add(true);
        hs.add(12);
        hs.add(false);
        hs.add(99.5);
        System.out.println(hs);
    }
}
