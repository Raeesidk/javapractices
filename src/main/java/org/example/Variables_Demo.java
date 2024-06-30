package org.example;

public class Variables_Demo
/**Variable in Java is a data container that stores the data values during Java program execution.
 * Every variable is assigned data type which designates the type and quantity of value it can hold. Variable is a memory location name of the data.*/
//There are three types of variables:- 1.Local variable 2.instance variable (global variable) 3. Static variable
{ /*1.Local variable: we can not attach static key word to local variable, No access modifiers for local variables,
*/
    public void add(int a, int b)
    {       //1.Local variable: A variable which is declared inside the method,Constructor/parameter of that method or block, of code is known as local variable
         int c = a+b;
        System.out.println("Addition od a+b is : " + c);
    }
    /*2.instance variable: 1) Declaration: Inside the Class but Outside methods, Constructors Or blocks. 2) Stored Memory: Heap-Memory.
3) Scope: Inside all methods, Blocks & Constructors with in a class(not inside the static method directly). in instance variable we need to create an object to access static method
4) When Variables gets Allocated: When object is created variable Allocated; & objects gets destroyed variable releases memory.
5) Default Value: They have default values like int=0Boolean= false, object= null.6) Access Specifier: Can be used & It can be called directly.*/

    int a = 786;  //2.instance variable (global variable) :- a variable  Inside the Class but Outside methods, Constructors Or blocks is known as Instance variable
    int b = 290;
    public void Substraction()
    {
        int c =a-b;
        System.out.println("Subctraction of a - b is : " + c);
    }

    /*3.Static Variables: Unlike the Local and Instance variable (where we can not use static), we have another variable type which is declared as static and is known as "Static or Class variable".
1. These variables cannot be local. 2. Static variables are shared among all the instances of a class. 3. The default values of Static/Class variables are the same as the Instance variables.
4. Static variables can be used within a program by calling the class Name or variable Name. 5. The memory allocated to store Static variables is Static memory.*/


    public static void main(String[] args)
    {
     Variables_Demo vd = new Variables_Demo();
     vd.add(10,30);
     vd.add(786,296);
     vd.Substraction();
    }

}
