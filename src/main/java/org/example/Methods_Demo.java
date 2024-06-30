package org.example;

public class Methods_Demo
/**Method : - Method is a group/block  of  code which takes input from user , and process it gives the output to the user
 * Methods run when it is called , We can pass the data known as parameters into method*/
/*Parameters : - Information can be passed to methods as parameter.Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses.We can add as many parameters as we want, just separate them with a comma.
Example:- static void mymethod(parameters:- (String name, int age )) we can give the values of variable while calling a method through object */ {
    static void myMethod(String fname, int age)
    {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}







