package org.example;

public class StringBuilderDemo
{
    /** String Builder: This class is used to create MUTABLE (modify/The existing value of the String cna be changed) String objects
    The String Builder class in java is same as the String class Except it is mutable i.e. it can be changed & it is not thread safe */

//    NOTE : - The  String Builder class is NOT Thread save (Non - synchronised )
// Important Constructors of String Builder class: -  String Builder(),  String Builder(String str) &  String Builder(int Length)
    public static void main(String[] args)
    {

        StringBuffer sb = new StringBuffer("Roronoa");  // 1.StringBuffer() :It creates an empty String buffer with initial capacity of 16.
        System.out.println(sb.capacity());
        //append() and insert() are methods you can use to modify strings,these methods are found in the StringBuilder and StringBuffer classes, which are designed for string manipulation
        sb.append("Zoro");  //The append() method is used to add text to the end of the existing sequence.
        System.out.println(sb); // Returns current value of the modified String ex: Ronald rose
        System.out.println(sb.insert(0, "MD"));  //The insert() method, on the other hand, adds text at a specified index ex: ("0" is index "MD" is string)
        sb.reverse();  // It will reverse the String value This method is available only in String Buffer & bulder class
        System.out.println(sb);
    }
}

/**Comparison between String Buffer and String Builder in Java

        1.Basic
String Buffer: Introduced with the initial release of Java.
String Builder: Introduced in Java 5.
2.Synchronized
String Buffer: It is synchronized.
String Builder: It is not synchronized.
3.Performance
String Buffer: It is thread-safe, so multiple threads can’t access it at the same time; therefore, it is slow.
String Builder: It is not thread-safe, hence faster than String Buffer.
        4.Mutable
Both are mutable and allow modification of strings without creating an object string.
       5. Storage
The storage for both is on the Heap.*/

