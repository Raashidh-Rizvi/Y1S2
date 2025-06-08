
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcetpionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,s=0;

        try {
            System.out.print("Enter number: ");
            n = sc.nextInt();
            System.out.print("Enter number: ");
            m = sc.nextInt();

             s = n / m;
        }
        catch(ArithmeticException e){
            System.out.println("Your Error is :"+e);
        }
        catch(InputMismatchException e){
            System.out.println("Your Error is :"+e);
        }
        catch (Exception e) {
            System.out.println("Your Errors is :"+e);
        }

        System.out.println("Final Answer Is : "+ s);

        }
    }
