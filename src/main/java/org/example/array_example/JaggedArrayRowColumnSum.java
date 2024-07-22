package org.example.array_example;

public class JaggedArrayRowColumnSum {
    public static void main(String[] args) {
        // Define a 2D jagged array
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        //TODO sum of each row
        for (int i = 0; i < jaggedArray.length; i++)
        {
            int rowSum = 0;
            for (int j = 0; j < jaggedArray[i].length; j++) {
                rowSum += jaggedArray[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " is: " + rowSum);
        }
        //TODO finding max column
        int maxColumns = 0;
        for (int i = 0; i < jaggedArray.length; i++)
        {
            if (jaggedArray[i].length > maxColumns)
            {
                maxColumns = jaggedArray[i].length;
            }
        }
        //TODO Sum of each column
        for (int j = 0; j < maxColumns; j++)
        {
            int columnSum = 0;
            for (int i = 0; i < jaggedArray.length; i++)
            {
                if (j < jaggedArray[i].length) {
                    columnSum += jaggedArray[i][j];
                }
            }
            System.out.println("Sum of column " + (j+1) + " is: " + columnSum);
        }
    }
}

