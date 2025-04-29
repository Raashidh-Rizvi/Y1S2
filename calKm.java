/*
 a) Declare two integer variables, miles and yards, and one double variable for kilome
ters
 b) Initialize the variables to hold the number of miles and yards in a marathon respec
tively (miles to 26 and yards to 385).
 c) Write an expression to calculate kilometers from miles and yards.
 d) Save the result of the expression in the variable kilometers.
 a. Note: One mile is 1.609 kilometers. There are 1760.0 yards in a mile
*/


public class calKm {
    public static void main(String[] args) {
        int miles, yard;
        double kilometers,km;

        yard = 385;
        miles= 26;

        km = miles * 1.609;
        kilometers = ( yard*1.609 / 1760) + km;



        System.out.print("Number Of Kilomter Is " + kilometers );

    }
}
