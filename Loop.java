/*
use for while to create the pattern
* * * * *

* * * * *

* * * * *

* * * * *

use for loop to create the pattern
         *
       *   *
     *   *   *
   *   *   *   *
 *   *   *   *   *



  */


public class Loop {

    public static void main(String[] args) {
        int c=1;

            while (c < 5){
                System.out.println("* * * * *");
                System.out.println();
                c++;

        }


        for (int a = 1; 5 >= a; a++) {



            for (int b = 5; a <= b; b--) {
                System.out.print("  ");
            }
            for (int d = 1; a >= d; d++) {
                    System.out.print(" *  ");

            }
            System.out.println();
        }

    }
}
