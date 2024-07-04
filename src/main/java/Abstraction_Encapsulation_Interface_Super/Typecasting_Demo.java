package Abstraction_Encapsulation_Interface_Super;
/**TypeCasting:- In Java, type casting is the process of converting one data type to another. There are two types of TypeCasting
 * Remember that in narrowing type casting, there may be data loss due to the conversion from a larger type to a smaller type. */
public class Typecasting_Demo
{
    public static void main(String[] args)
    {//1.Widening/Implicit TypeCasting:- Java automatically converts a lower data type (with smaller size) to a higher data type (with larger size).
        int a=99;
        double data=a;
        System.out.println(data); //Here, the int value is automatically converted to a double.
// 2.Narrowing/Explicit Typecasting:-We manually convert a higher data type to a lower data type using parentheses.
        double num = 10.99;
        int variable = (int) num; // double to int
        System.out.println(variable);  //In this case, the double value is explicitly cast to an int.

    }


}
