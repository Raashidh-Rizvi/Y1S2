/*
a) Create a class called EvenOddNumber.
b) It has a method called findEvenOrOdd(int i) to find whether a number is even
or odd.
c) This method takes an integer argument and returns a boolean value.
        (Note: There is a data type called boolean in java which can store true/false values)
        1
d) Then create another class Demo with the main method and create an object from
        EvenOddNumber class.
e) Using the created object, call the findEvenOrOdd() method and display outputs
indicating whether those are even numbers or odd numbers.

*/
import java.util.Scanner;

public class EvenOddNumber {

    public boolean FindEvenOddNumber(int i) {

        return i % 2 == 0;
    }
}


class demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int a = 0; a != -99; a++) {

            System.out.print("Enter a Number : ");

            int i = input.nextInt();

            EvenOddNumber number = new EvenOddNumber();

           if ( number.FindEvenOddNumber(i)) {

               System.out.println("Number You Entered Is Even");
           }
           else  System.out.println("Number You Entered Is Odd");
        }
    }

}