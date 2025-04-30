/*
 Write a Java program to calculate an employee’s salary based on their employment type
 and overtime hours.
 a. The program should accept user input for:
 • Employee Type (1, 2, or 3)
 • Basic Salary
 • Overtime Hours (otHours)
 b. Based on the Employee Type, assign the respective Overtime Rate (OtRate) as
 follows:
 • Type 1 → OtRate = 1000
 • Type 2 → OtRate = 1500
 • Type 3 → OtRate = 1700
 c. Calculate the Total Salary using the formula.
 Total Salary = Basic Salary + (otHours * OtRate)
 d. Display the employee’s total salary after including overtime pay.

*/
import java.util.Scanner;

public class employeeSalaryCalculator {
    public int type;
    public double otRate;


    public void employeeType(int type) {

        this.type=type;
        switch (type) {

            case 1: otRate =1000.00;
            break;

            case 2: otRate = 1500.00;
            break;

            default:otRate = 1700.00;

        }

    }

    public void calSalary(double basicSalary,int otHours) {
        double salary = basicSalary + (otHours * otRate);
        System.out.println("Total Salary is : Rs." + salary +"0");

    }




}

class main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Type : ");
        int type = input.nextInt();

        System.out.print("Enter Basic salary : ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter The OT Hours : ");
        int otHours = input.nextInt();




        employeeSalaryCalculator employee =new employeeSalaryCalculator();

        employee.employeeType(type);
        employee.calSalary(basicSalary,otHours);

    }


}





