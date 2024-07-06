package Collections_Framework;
/*There are several implementations of the Map interface in Java:
HashMap: Provides fast access and doesn’t maintain any order.
LinkedHashMap: Maintains insertion order (useful when order matters).
TreeMap: Maintains keys in ascending order (based on natural ordering or a custom comparator).*/
import java.util.HashMap;
import java.util.Map;
/**Map: - Map is nothing, but always Storing the data based on the Key-value-pairs
 * Remember, Maps are powerful for efficient data retrieval based on keys*/
public class Map_Demo
{
    public static void main(String[] args)
    {
        Map m = new HashMap();
        m.put(101,"raees");
        m.put(234,"rose");
        m.put(143,"Muskan");
        m.put(24,"Nasiya");
        m.put(456,23.5);
        m.put(2011,"Nafiya");
        System.out.println(m);
        System.out.println(m.get(2011));
        /*Common Map Methods:
put(key, value): Inserts a key-value pair into the map.
get(key): Retrieves the value associated with a key.
containsKey(key): Checks if a key exists in the map.
keySet(): Returns a set of all keys.*/
    }
}
