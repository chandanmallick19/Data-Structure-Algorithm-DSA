/*
Define an interface EmpInterface (void displayEmp(), void giveBonus(double amount)).
Define an abstract class Employee (empID, fName, lName, salary). Define a concrete class
Manager (bonus) subclass of Employee and define the interface methods. Perform the
followings:
a. Define the appropriate constructor in class hierarchy
b. Ensure the bonus amount should not be negative and zero using exception
handling
c. Create an array of interface reference variables and populate with manager objects.
d. Write a Test class to implement the above said requirements of interface
implementation and exception handling.
 */

package Assignment2;
import java.util.Scanner;
interface EmpInterfaces{
    void displayEmp();
    void giveBonus(double bonus);
}
abstract class Employees{
    int empID;
    String fName;
    String lName;
    double salary;
}
class Managers extends Employees implements EmpInterfaces {
    Scanner sc = new Scanner(System.in);

    Managers(int empID, String fName, String lName, double salary) {
        this.empID = empID;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        System.out.println("Employee ID: "+empID+" Full Name is:"+fName+" "+lName+" Salary is:"+salary);
    }

    public void giveBonus(double bonus) {

        if (bonus <= 0)
            throw new ArithmeticException("invalid");
        else
            salary = salary + bonus;
    }

    public void displayEmp() {
        System.out.println("Total salary is: "+salary+"");
    }
}
    public class A2Q8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of employee: ");
            int i = sc.nextInt();
            int empID;
            String fName, lName;
            double salary;
            EmpInterfaces a[] = new Managers[i];
            for (int j = 0; j < a.length; j++) {
                System.out.println("Employee No: " + (j + 1));
                System.out.println("Enter empID: ");
                empID = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the first name: ");
                fName = sc.nextLine();
                System.out.println("Enter the last name: ");
                lName = sc.nextLine();
                System.out.println("Enter the salary: ");
                salary = sc.nextDouble();
                a[j] = new Managers(empID, fName, lName, salary);
                System.out.println("Enter bonus: ");
                double bonus = sc.nextDouble();
                a[j].giveBonus(bonus);
                a[j].displayEmp();
            }
        }
    }
