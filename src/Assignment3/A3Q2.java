/*
Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java.
 */

package Assignment3;
import java.util.Scanner;
public class A3Q2 {
    public static void main(String[] args) {
        A3Q2 ob = new A3Q2();
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.print("Enter the position number to add colors: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the color name: ");
        String color = sc.nextLine();
        try {
            arr[n] = color;
            System.out.println("Color successfully added !");
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
