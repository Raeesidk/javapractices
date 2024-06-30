package org.example;

import AccessModifier.WithinSameClass;

public class OutsideThePackage
{
    public static void main(String[] args) {
        WithinSameClass obj = new WithinSameClass();
        obj.publicMethod();
    }
}
