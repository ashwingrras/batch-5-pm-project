package org.example.lambda_expression;

/*
    Tasks
    1. second maximum find array using lambda method
    2. linear search using lambda method
    3. sorted array (bubble) using lambda method


 */

public class MainClass
{
    public static void main(String[] args)
    {
        //First way
        TestInterface1 testInterface1 = new TestClass();
        System.out.println(testInterface1.sum(9,8));

        //Second way
        TestInterface1 testInterface2 = new TestInterface1() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(testInterface2.sum(2,3));

        //Third way
        TestInterface1 testInterface3 = (int a, int b) -> a + b;
        System.out.println(testInterface3.sum(4, 6));

        //Fourth way
        // method reference
        TestInterface1 testInterface4 = Integer::sum;
        System.out.println(testInterface4.sum(4, 6));


        // method reference
        TestInterface2 testInterface2_1 = Math::max;
        System.out.println(testInterface2_1.max(4, 6));

        //Block lambda expression
        TestInterface1 testInterface5 = (int a, int b) ->
        {
            return a + b;
        };
        System.out.println(testInterface3.sum(4, 6));
        int[] array = {2, 4, 5, 7, 3, 8};
        SecondMaxInterface secondMaxInterface = (arr) ->
        {
            int max = -1;
            int secondMax = -1;
            if(arr.length > 0)
            {
                max = secondMax = arr[0];
                for(int i=0; i < arr.length; i++)
                {
                    if(arr[i] > max)
                    {
                        secondMax = max;
                        max = arr[i];
                    }
                    else if(arr[i] > secondMax && secondMax != max)
                    {
                        secondMax = arr[i];
                    }
                }
            }
            return secondMax;
        };
        int secondMax = secondMaxInterface.sort(array);
        if(secondMax != -1)
        {
            System.out.println("second max: "+secondMax);
        }
        else
        {
            System.out.println("item not found");
        }

        InterfaceForLinearSearch interfaceForLinearSearch = (arr, value) ->
        {
            int index = -1;
            for(int i =0; i < arr.length; i++)
            {
                if(arr[i] == value)
                {
                    index = i;
                    break;
                }
            }
            return index;
        };
        int value = 3;
        System.out.println("searched index at: "+interfaceForLinearSearch.linearSearch(array, value));
    }
}
