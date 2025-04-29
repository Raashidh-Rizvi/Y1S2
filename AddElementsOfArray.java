/*
 Write a Java program to add the elements of arrays A and B and store the result in a
 new array, C
 int A[5] = 10, 20, 30, 40, 50;
 int B[5] = 34, 67, 12, 89, 12;
 int C[5];
 Calculate A+B and store in Array C. → Compute the sum of corresponding elements in
 arrays A and B and store them in array C.
 Example Output: Array C: [44, 87, 42, 129, 62]
 */

public class AddElementsOfArray {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];



        System.out.print("Array C : [ ");

        for (int i =0  ; i<A.length; i++) {

            C[i] = A[i] + B[i];

            System.out.print(C[i]+ " ");
        }
        System.out.println("]");
    }
}
