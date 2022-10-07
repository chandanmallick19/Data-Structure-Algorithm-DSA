/*
Write a Java method that takes an array of int values and determines if
there is a pair of distinct elements of the array whose product is odd.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q7 {
    public static void oddProduct(int a[]){
        System.out.println("Distinct elements of the array whose product is odd");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[i]!=a[j]){
                    if (a[i]*a[j]%2!=0)
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        System.out.print("The array elements are: ");
        for(int i=0;i<n;i++)
            System.out.print(x[i]+" ");
        System.out.println();
        oddProduct(x);
    }
}
