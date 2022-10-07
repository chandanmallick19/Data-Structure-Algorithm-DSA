/*
Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.
 */

package Assignment3;
import java.util.Scanner;
public class A3Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your lucky number: ");
        int i=sc.nextInt();
        try{
            if(i<0) {
                throw new NumberFormatException("Number format exception");
            }
            System.out.println("Your lucky number is: "+i);
        }
            catch (NumberFormatException e){
                System.out.println("Not the lucky!! Seems you encounter an Exception");
                System.out.println(e);
            }
        }
    }
