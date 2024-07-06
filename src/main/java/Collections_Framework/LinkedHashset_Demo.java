package Collections_Framework;

import java.util.LinkedHashSet;
/**Java LinkedHashSet class contains unique elements only like HashSet. Java LinkedHashSet class provides all optional set operations and permits null elements.
 * Java LinkedHashSet class is non-synchronized. Java LinkedHashSet class maintains insertion order. */
public class LinkedHashset_Demo
{
    public static void main(String[] args)
    { /*1. LinkedHashSet maintains Insertion order.* 2. It can store null value* 3. It cannot store duplicate value*/
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(65);
        lhs.add(203);
        lhs.add("Ronin");
        lhs.add(7.5);
        System.out.println(lhs);

    }
}
