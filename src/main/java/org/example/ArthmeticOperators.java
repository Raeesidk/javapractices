package org.example;

public class ArthmeticOperators
//    arithmeticOperators : -    +,-,*,/,%,++,--
{
    public static void main (String [] args)
    {
        int a = 10;
        int b = 20;

        System.out.println("a+b" + (a+b));
        System.out.println("a-b" + (a-b));
        System.out.println("a*b" + (a*b));
        System.out.println("a/b" + (a/b));
        System.out.println("a&b" + (a%b));
        System.out.println("b/a" + (b/a));
        System.out.println("b%a" + (b%a));
//     Uniary operators
        System.out.println(++a);
        System.out.println(--b);
//        different way for increment & decrement
        System.out.println(a++);
        System.out.println(a);
        System.out.println(b--);
        System.out.println(b);


    }
}
