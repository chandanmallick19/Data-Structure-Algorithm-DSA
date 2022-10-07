/*
Write a Java method, idOdd, that takes an int i and returns true if abd only if i is odd.
your method can't use the multiplication, modulus, or division operators, however.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q5 {
    public static boolean isOdd(int n) {
        while (n>0) {
            n=n-2;
        }
        if(n==1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n=sc.nextInt();
        boolean res=isOdd(n);
        System.out.println(res);
        if(res=true) {
            System.out.println(n + " is an odd number");
        }else {
            System.out.println(n + " is an even number");
        }
    }
}
