public class MethodsRecursion {

    public static void main(String[] args) {
        System.out.println();
        Recursion(10); //calling Method
    }


    public static void Recursion(int n) {
        if (n == 2) {
            System.out.println(2);
        } else {
            System.out.println(n);
            Recursion(n - 1); //for loop
        }
    }

}