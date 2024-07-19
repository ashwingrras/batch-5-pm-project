package org.example.oops_examples.encapsulation;


class First

{

    First()
    {
        System.out.println(" at First class constructor");
        BlockStatementExample blockStatementExample = new BlockStatementExample();
    }

    {
        System.out.println(" at First class block statement, 222222");
    }
    {
        System.out.println(" at First class block statement, 111111");
    }

}

public class BlockStatementExample
{
    {
        System.out.println(" at BlockStatementExample class block statement");
    }
    public static void main(String[] args) {

        First first = new First();
    }
}
