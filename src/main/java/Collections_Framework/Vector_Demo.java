package Collections_Framework;

import java.util.Vector;
/**Vector: - Vector is a legacy class which was introduced in JDK 1.0 version & It is similar to ArrayList.
 * Vector is an implemented class of List interface which is present in java. util package. Vector underline data-structure is “growable array" or “resizable array”.
 */
public class Vector_Demo
{
    /*1.It is Similar to ArrayList
    * 2.It is SYNCHRONIZED */
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add(true);
        v.add(75.9);
        v.add(913379331244L);
        v.add(24);
        v.add("🥷Zoro🥷🏻");
        System.out.println(v);
        System.out.println(v.indexOf(913379331244L));
    }
}
