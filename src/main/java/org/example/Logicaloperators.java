package org.example;
/**Logical operators are used to determine the logic between variables or values:
You can also test for true or false values with logical operators.**/
public class Logicaloperators
{
    public static void main(String[] args)
    {

        int x=5;
//        &&    Logical and :-	 Returns true if both statements are true
        System.out.println(x > 3 &&  x < 10);
//     ||   Logical or	Returns true if one of the statements is true
        System.out.println(x > 6 || x < 10);
//      !  Logical not	Reverse the result, returns false if the result is true
        System.out.println (!(x > 3 &&  x < 10));
    }
}
