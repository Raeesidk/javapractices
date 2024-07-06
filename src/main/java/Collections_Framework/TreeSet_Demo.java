package Collections_Framework;

import java.util.TreeSet;
/***/
public class TreeSet_Demo
{
    public static void main(String[] args)
    { /*1. TreeSet class maintains ascending order.*2. TreeSet class doesn't allow null element.*3. It doesn't allow duplicate data*/
        TreeSet ts = new TreeSet();
        ts.add(56);
        ts.add(15);
        ts.add(100);
        System.out.println(ts);

        /*Note:- When you print the TreeSet, it will display the elements in ascending order. However, since the elements are of different types (numeric and non-numeric), the comparison might lead to unexpected results.
        * To ensure consistent behavior, consider using a TreeSet with elements of the same DATA TYPE (e.g., all numbers or all strings).*/
    }
}
