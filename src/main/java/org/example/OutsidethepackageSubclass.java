package org.example;

import AccessModifier.WithinSameClass;
// with the help of inheritance key word only we can access protected Method.
public class OutsidethepackageSubclass extends WithinSameClass
{
    public static void main(String[] args)
    {
        OutsidethepackageSubclass ops=new OutsidethepackageSubclass();
        ops.protectedMethod();
        ops.publicMethod();
    }
}
