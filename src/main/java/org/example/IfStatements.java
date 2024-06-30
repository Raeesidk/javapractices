package org.example;

/**Conditional Statements : this allows us to execute the block of code on certain true conditions
* 1. if Statement,if else, nested if, if else if ladder.
 * 1.if statement: - The java if statement test the condition .It executes the if block if the condition  is true.*/


public class IfStatements
{
    public static void main(String[] args)
    {
        int samsung = 14;

        if (samsung > 11)
          {
             System.out.println("SAMSUNG is Greater then iphone");   // here this  block of code got executed because the if condition was true
          }

        int CGPA = 75;
/** 2.if - Else statement:- The java if - Else statement also test the condition .
 * It executes the if block if the condition  is true Otherwise "else" block is executed.*/
        if (CGPA>70)
        {
            System.out.println("Employment");
        }
        else                            /*** here if condition is true then it will execute the if statement/block of code
                                        else if condition is false then it will execute else statement / block of code***/
        {
            System.out.println("Unemployment");
        }





    }
}
