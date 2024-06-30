package org.example;

public class IfElseifladder
{
//                         logical operators: &&,||,!

    /**4.ifelseifladder:- these statements execute  one condition from Multiple statements.
     */

   public static void main(String [] args)
   {
       int marks = 45;

       if (marks>35 && marks<40)
       {
           System.out.println("Biryani");
       }
       else if (marks<50 && marks>43)
       {
          System.out.println("party");
       }
       else
       {
           System.out.println("punishment");
       }
   }


}
