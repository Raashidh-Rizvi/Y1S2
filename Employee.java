import java.util.Scanner;
public class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private int performanceRating;
    private int bonusRate;

    public Employee() {}
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }
    public int setBonusRate() {
        switch(performanceRating) {
            case 5 : this.bonusRate = 20;
            break;
            case 4 : this.bonusRate = 15;
            break;
            case 3 : this.bonusRate = 10;
            break;
            case 2 : this.bonusRate = 5;
            break;
            default : this.bonusRate = 0;
        }
        return bonusRate;
    }
    public double getBonusRate() {
       return setBonusRate();
    }
    public double calculateBonus(){
       return basicSalary * getBonusRate()/100;
    }
    public double TotalSalary(){
        return calculateBonus() + basicSalary;
    }

    public void displayInformation(){

        System.out.println();
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + TotalSalary());

    }
}

class EmployeeSalary{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();


        System.out.println("Enter Employee ID:");
        emp.setId(sc.nextInt());

        System.out.println("Enter Employee Name");
        emp.setName(sc.next());

        System.out.println("Enter Employee Salary:");
        emp.setBasicSalary(sc.nextDouble());

        System.out.println("Enter Employee Performance Rating:");
        emp.setPerformanceRating(sc.nextInt());

        emp.displayInformation();

    }
}
