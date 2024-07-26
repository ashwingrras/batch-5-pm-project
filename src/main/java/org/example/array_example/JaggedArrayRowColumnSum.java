package org.example.array_example;

public class JaggedArrayRowColumnSum {
    public static void main(String[] args) {
        // Define a 2D jagged array
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                {5, 4, 1},
                {1},
                {}
        };
        //TODO find sum of rows
        for (int i = 0; i < jaggedArray.length; i++)
        {
            int rowSum = 0;
            for (int j = 0; j < jaggedArray[i].length; j++)
            {
                rowSum += jaggedArray[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " is: " + rowSum);
        }
        int maxColumn = 0;
        //TODO find maximum column
        for (int i = 0; i < jaggedArray.length; i++)
        {
            if (jaggedArray[i].length > maxColumn)
            {
                maxColumn = jaggedArray[i].length;
            }
        }
        //TODO Sum of each column
        for (int j = 0; j < maxColumn; j++)
        {
            int columnSum = 0;
            //
            for (int i = 0; i < jaggedArray.length; i++)
            {
                // till column length
                if (j < jaggedArray[i].length)
                {
                    columnSum += jaggedArray[i][j];
                }
            }
            //
            System.out.println("Sum of column " + (j+1) + " is: " + columnSum);
        }
    }
}

