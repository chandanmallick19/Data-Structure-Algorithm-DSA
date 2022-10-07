/* Write a Java program that takes as input three integers, a,b, and c, from the java console.
and determines if they can be used in a correct arithmetic formula(in the given order), like
"a+b=c","a=b-c" or "a*b=c".
 */

package Assignment1;
import java.util.Scanner;
public class A1Q1 {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int a,b,c;
        System.out.println("Enter three Integers respectively: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b==c||a==b-c||a*b==c)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}

