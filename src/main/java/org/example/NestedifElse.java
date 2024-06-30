package org.example;

public class NestedifElse
    /**3.NestedifElse :- in Nested if else we can specify the condition inside another condition .*/
{
    public static void main(String[] arggs)
    {
        int Salary = 50000;
        if (Salary>20000)
        {
            System.out.println("Eligible for Loan Approvals ");
            if (Salary>21500)
            {
                System.out.println("Eligible for Bike loan category");
                if (Salary>24000)
                {
                    System.out.println("Eligible for personal loan category");
                    if (Salary>29000)
                    {
                        System.out.println("Eligible for car loan category");
                        if (Salary>24500)
                        {
                            System.out.println("Eligible for study loan category");
                            if (Salary>40000)
                            {
                                System.out.println("Eligible for house loan category");
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("Not Eligible for Loan");
        }
    }
}
