package org.example.generics;


class Utils {



    public <T> T getFirstElement(T[] array)
    {
        return array[0];
    }

    public <P extends Number> Double getSecondElement(P a, P b)
    {
        return (Double) a;
    }

    public <P> Integer getData(P a, P b)
    {

        int sum = ((Integer) a).intValue() + ((Integer) b).intValue();
        return sum;
    }

    public <S> S getDataNew(S a, S b)
    {


        return a;
    }

    /*
    public <P> Integer getData(P a, P b)
    {

        int sum = ((Integer) a).intValue() + ((Integer) b).intValue();
        return sum;
    }
    */

    int[] arrInt = {4, 3, 1, 6};
    String[] arrStr = {"raju", "sharwan", "Nischal", "prerna"};

    public String getFirstStrElement(String[] arrStr)
    {
        return arrStr[0];
    }

    public int getFirstIntElement(int[] arrInt)
    {
        return  arrInt[0];
    }

}

public class GenericMethodExample {
    public static void main(String[] args) {

        Utils utils = new Utils();

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.4, 3.6, 4.9, 5.9};
        String[] strArray = {"apple", "orange", "banana"};

        System.out.println(utils.getData(1, 3.8));

        Double a = 10.0;
        Integer b = 6;

        Double c = a + b;

        Integer firstInt = utils.getFirstElement(intArray);
        double firstDouble = utils.getFirstElement(doubleArray);
        String firstStr = utils.getFirstElement(strArray);


//        System.out.println("First Integer: " + firstInt);
//        System.out.println("First Double: " + firstDouble);
//        System.out.println("First String: " + firstStr);
    }
}

