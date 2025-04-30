/*
 Write a Java program to accept 5 integer values from the user and store them in an array.
 Then;
 a. Find the largest value in the array.
 b. Find the sum of all elements in the array.
 c. Display both the largest value and the sum of elements.
*/

import java.util.Scanner;

public class addingSumOfElementsInArray {
    public static void main(String[] args) {

        int sum = 0;
        int max = 0;


        int []array = new int [5];
        Scanner input = new Scanner (System.in) ;

        for (int i = 0; i < 5; i++){

            System.out.print("Enter the Element "+ (i+1)+ (" : "));
            array[i] = input.nextInt();

        }

        for (int i = 0; i < 5; i++) {

            if (max < array[i]) {
                max = array[i];

            }
            sum+=array[i]; //sum=sum+array[i]
        }
        System.out.println("Largest Number Of The Array Is : "+max);
        System.out.println("Sum Of The Elements in the array is : " + sum);


    }

}
