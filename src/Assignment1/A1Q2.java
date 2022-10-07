/*
Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.print("Enter a positive integer: ");
        int number=sc.nextInt();
        while(number>=2) {
            if(number>=2)
                number = number-2;
                count++;
            }
        System.out.println("The entered number can be divided by 2 for "+count+" times.");
        }

        }