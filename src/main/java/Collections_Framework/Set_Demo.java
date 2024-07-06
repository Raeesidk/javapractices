package Collections_Framework;

import java.util.HashSet;
import java.util.Set;
/**Set:- It extends the Collection interface.
 A Set represents an unordered collection of unique elements.
 Unlike a list, a Set does not allow duplicate values.
 Think of it as a mathematical set where each element appears only once.
 Remember, Sets are useful when you need to store a collection of unique elements without any specific order.*/
public class Set_Demo
{  /*1. Set follow random order.* 2. Set Stores the data based on Hashcode (Address/Location of an element) .* 3. It cannot store duplicate value*/
    /*Common Set Methods:
add(element): Adds an element to the set (if not already present).
addAll(collection): Appends elements from a collection to the set.
contains(element): Checks if an element is in the set.
remove(element): Removes an element from the set.
isEmpty(): Checks if the set is empty.*/
    public static void main(String[] args)
    {
        Set s = new HashSet();
        s.add(true);
        s.add(12);
        s.add(false);
        s.add(99.5);
        s.add(null);
        System.out.println(s);
    }
}
