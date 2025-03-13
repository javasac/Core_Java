package com.sachin.Arrays;

public class TwoDArrays
{
    int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    void printArr()
    {
        int left = 0;

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printIndex()
    {
        int left = 0;

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++)
            {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        TwoDArrays d2 = new TwoDArrays();
        d2.printArr();
        d2.printIndex();
    }
}
