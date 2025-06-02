/*
 You have been hired by a Ride-Sharing Company to develop a Driver Performance
 Management System that tracks driver details, calculates earnings, and rewards per
formance- based bonuses. Each month, drivers receive a performance score (1 to 5) based
 on customer ratings, with higher scores leading to higher bonus percentages of their base
 salary.
 The bonus policy is as follows:
 Performance Score | Bonus Percentage
------------------|------------------
5                 | 25% of Base Salary
4                 | 20% of Base Salary
3                 | 15% of Base Salary
2                 | 10% of Base Salary
1                 | No Bonus (0%)

a) Implement a class called Driver that includes four attributes: driverID, driver
Name, baseSalary, and performanceScore.
 b) The class should support constructor overloading, allowing different ways to initial
ize a Driver object. There should be three constructors:
 • one that accepts only driverID and driverName
 • another that includes only the baseSalary
 • third that initializes all four attributes, including performanceScore.
 c) Implement getters and setters for driverID and performanceScore. The setter for
 performanceScore must validate that the value is between 1 and 5. If an invalid
 score is provided, it should default to 1.
 d) Create two versions of the calculateBonus() method:
 • one that calculates the bonus based on the driver’s actual performance score
 (attribute)
 • another that allows a custom score (parameter) to be used without modifying
 the stored value.
 e) Additionally, implement a calculateTotalSalary() method to compute the final salary
 by adding the base salary and the calculated bonus.
 f) Implement a main method and create Driver objects to demonstrate the above
 variations of constructors. Then call the appropriate methods to calculate the
 salaries and display all the details of each driver.
*/

public class Driver {
    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;
    private double bonus;

    public Driver (String driverID, String driverName, double baseSalary, int performanceScore) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        this.performanceScore = performanceScore;
    }

    public Driver (String driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = 0.0;
        this.performanceScore = 1;

    }

    public Driver ( double baseSalary) {
        this.driverID ="null";
        this.driverName = "null";
        this.baseSalary = baseSalary;
        this.performanceScore = 1;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public int getPerformanceScore(int i) {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        if (performanceScore < 1 || performanceScore > 5 ) {
            this.performanceScore = 1;
        }
        this.performanceScore = performanceScore;
    }
    public double totalBonus(){
        switch (performanceScore) {
            case 5:bonus = 0.25;
            break;
            case 4:bonus = 0.20;
            break;
            case 3:bonus = 0.15;
            break;
            case 2:bonus = 0.1;
            break;
            default:bonus = 0;
        }
        return bonus * baseSalary;
    }
    public double calculateBonus(int customScore) {
        if (customScore < 1 || customScore > 5) {
            customScore = 1;
            setPerformanceScore(customScore);
            return totalBonus();
        }

          setPerformanceScore(customScore);
        return totalBonus();


    }
    public double totalSalary() {

        return baseSalary+totalBonus();
    }
    public void displayDetails(){
        System.out.println("Driver ID: " + driverID);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + totalBonus());
        System.out.println("Total Salary: " + totalSalary());
        System.out.println();

    }
}


class DriverPerformanceManagementSystem {
    public static void main(String[] args) {

        Driver D1 = new Driver("D1", "David");
        Driver D2 = new Driver("D2", "Chamath",100000,3);
        Driver D3 = new Driver(54000);
        Driver D4 = new Driver("D4", "Chamathini",150000,10);

        D1.displayDetails();
        D2.displayDetails();
        D3.displayDetails();
        D4.displayDetails();


        System.out.println("Bonus For Driver3 is " +D3.calculateBonus(3));

    }
}

