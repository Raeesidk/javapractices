package org.example;

public class ArrayDemo
{
    /**Array: - An Array is an object that holds a fixed number of values of  Homogeneous/SSimilar data types
     Declaration of array : - int [] a; & memory allocation:- = new int[]*/

    public static void main(String[] args)
    {
//          SYNTAX: The default value of an array is  "0"
        // Array stores the value of data type in index form
        int [] a = new int[5];  // Here we create an array of length 5 & index value will always start from "0"
//        initialization of value ;
        a[0]= 12;
        a[1] = 15;
        a [2] = 20;
        a[3] = 54;
        a[4] = 35;
        //        Array with for loop
        for (int i=0; i<a.length; i++ )
        {
        System.out.println(a [i]);
        }
//        System.out.println(a[0] );
//        System.out.println(a[1] );
//        2 Another way to create an array in one line
        int [] b = {10,20,30,90,59};
        for (int e:b)
        {
            System.out.println(e);
        }
/** Multidimensional array : - In such case, data is stored in row and column based index (also known as matrix form).*/
//Syntax to Declare Multidimensional Array in Java : -
// int[][] a; (or)
//int [][]a; (or)
//inta,[][]; (or)
//int []a[];
        /**int[][] a, b; // here 'a' and 'b' both are 2-D Arrays.
int[] a[], b; // here 'a' is 2-D and 'b' is 1-D Array.
int[] a, b[]; // 'a' and 'b' both are 2-D Array.
int[] []a, []b; // compile time error.
int[][] a, b[]; // 'a' is 2-D and 'b' is 3-D Array.*/
        int[][] k = new int[2][3];
        k[0][0] = 10;
        k[0][1] = 20;
        k[0][2] = 30;
        k[1][0] = 40;
        k[1][1] = 50;
        k[1][2] = 60;
for (int r=0; r<k.length; r++)  // r stand for row
{
    for (int c=0; c<k[r].length; c++) // c stands for column 
    {
        System.out.print(k[r][c]+" ");

    }
    System.out.println();
}
        System.out.println("__________________________________________________________");
        int [][] d = {{10,20,30},{40,50,60},{70,80,90}};
        for (int r=0; r<d.length; r++)  // r stand for row
        {
            for (int c=0; c<d[r].length; c++) // c stands for column
            {
                System.out.print(d[r][c]+" ");

            }
            System.out.println();
        }
    }
}
