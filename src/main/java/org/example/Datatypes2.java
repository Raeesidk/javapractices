package org.example;

public class Datatypes2
{
    public static void main (String [] args)
    {

        byte  b = -128;
        System.out.println("byte data type value" +b);
        //

        short s = -32768; //
        System.out.println("short data type value" +s);

        int i = -1456789300;// Default value of int is 0
        System.out.println("Integer data type value" +i);

        long l = -9223372036854775808L ; // while giving the value for the long data type include "L" at end of the value
        System.out.println("long data type value" +l); // so system can recognize it's a long data type

        float f = 123.1321996418613189731F; //while giving the value for the float data type include "F" at end of the value
        System.out.println("float data type value" +f);

        double d = 6593.15484641318484694D; //while giving the value for the double data type include "D" at end of the value
        System.out.println("double data type value" +d);

        char ch= 'r';//
        System.out.println("char data type value" +ch);

        boolean bl = true; // it is a Data type that only stores "True" & "False" kind of thing only
        System.out.println("boolean data type value" +bl);

//        Non-primitive Data types

        String st = "Raees !@#%$#%^&^*(*))_+";  // String means a group of characters and symbols
        System.out.println("String data type value" +st);


    }
}
