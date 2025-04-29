/*
Create a class called “Calculator” and implement three Java methods to perform the
following operations.
        • add()– add two integers pass as parameters and return the result
 • multiply()– multiply two integers pass as parameters and return the result
 • square()– receive an integer as a parameter and return the result after multiplying
the number by itself.
Use the above methods in the Main Method to calculate the result of the following
mathematical expressions:
        1. (3 ∗ 4 +  5 ∗ 7)^2
        2. (4 + 7 )^2 +( 8 + 3)^2
        */


public class Calculator {

    public int add(int a, int b) {

        return a + b;
    }

    public int multiply(int a, int b) {

        return a * b;
    }

    public int square(int a) {
        return a * a;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int squared1 =  calculator.square( calculator.add(( calculator.multiply(3, 4)),  calculator.multiply(5, 7)));

        System.out.print("( 3 ∗ 4 +  5 ∗ 7)^2 = "+ squared1);

        System.out.println();

        int squared2 = calculator.add(calculator.square(calculator.add (4,7)), calculator.square(calculator.add(8,3)));

        System.out.println("(4 + 7 )^2 +( 8 + 3)^2 = " + squared2);
    }
}