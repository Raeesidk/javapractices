package org.example;


public class JaggedArraydemo
{
    public static void main(String[] args)
    {
        int[][] a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[2];
       a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[1][0] = 40;
        a[1][1] = 50;
        for (int r=0; r<a.length; r++)  // r stand for row
        {
            for (int c=0; c<a[r].length; c++) // c stands for column
            {
                System.out.print(a[r][c]+" ");

            }
            System.out.println();
        }
//                                                                         OR
        System.out.println("__________________________________________________________");
        int [][] d = {{10,20,30},
                          {40,50,},
                          {70,}};
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
