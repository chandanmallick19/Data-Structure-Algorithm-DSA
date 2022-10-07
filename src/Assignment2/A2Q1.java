/*
Write a class, Commission, which has:
 An instance variable, sales; an appropriate constructor; and a method, getCommission()
that returns the commission.
Now write a Demo class in Java to test the Commission class by reading a sale from the
user, using it to create a Commission object after validating that the value is not negative.
Finally, call the getCommission() method to get and print the commission. If the sales are
negative, your Demo class should print the message “Invalid Input”.
2.
 */

package Assignment2;
import java.util.Scanner;
class commission{
    double sale,x;
    commission(int s){
        sale=s;
    }
    double getCommission(){
        if (sale<500)
            x=0.02*sale;
        if (500<sale&&sale<5000)
            x=sale*0.05;
        if(sale>5000)
            x=sale*0.08;
        return x;
    }
}
public class A2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sale is: ");
        int s = sc.nextInt();
        if (s < 0)
            System.out.println("Invalid Input.");
        else {
            commission obj = new commission(s);
            double res = obj.getCommission();
            System.out.println("COMISSION: " + res);
        }
    }
}
