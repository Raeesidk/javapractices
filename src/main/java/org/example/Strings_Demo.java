package org.example;

public class Strings_Demo
{
/** String : - Is  a Collection/Sequence  of characters , much like a sentence is a sequence of words & An array of Characters works same as String.
 String Creation:- You can create a String in Java in two main ways:*/
/**"WHETHER YOU CREATE A STRING USING A STRING LITERAL OR WITH THE NEW KEYWORD, THE RESULTING STRING OBJECT IS IMMUTABLE(It  cant modify/update the existing value )."*/
public static void main(String[] args)
{
/*1.String Literal: A Java String literal is created by using double quotes. Each time you create a string literal, the JVM checks the “string constant pool” first. If the string already exists
in the pool, a reference to the pooled instance is returned. If the string doesn’t exist in the pool, a new string instance is created and placed in the pool. For example:*/

     String s1= "Raees";    // while creating the String Variable  in a literal way only one object(" s1 = Raees") is created in SCP/SLP
      /*This literal way of STRING IS IMMUTABLE(We can not create duplicates of the string in SCP/SLP ) */

      System.out.println("The value of s1 is : " + s1);

      /*2.By new keyword:  When you create a string with the new keyword, like so
In this case, the JVM will create a new string object in the normal (non-pool) heap memory, and the literal “Welcome” will be placed in the string constant pool.
The variable s will refer to the object in the heap (non-pool). */

      String s = new String("john");   // This results in the creation of two objects and one reference variable
      System.out.println("the value of s is : " + s);

//      String Methods : -

    String s2 = "Ibraheem";
    System.out.println("The length of the value is : " + s2.length());
    System.out.println(s2.isEmpty());
    System.out.println(s2.toUpperCase());
    System.out.println(s2.concat(" Alahe salam"));
    System.out.println(s2.contains("heem"));

}
}
