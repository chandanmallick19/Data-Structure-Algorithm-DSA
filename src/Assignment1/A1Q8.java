/*
Write a Java program that takes two arrays a and b of length n storing int values,
and returns the dot product of a and b. That is, it returns an array c of length n
such that c[i]=a[i].b[i],for i=0,....,n-1.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q8 {
    public static void findDotProduct(int[]a,int[]b,int n){
        int c[]=new int[n];
        for (int i=0;i<n;i++)
            c[i]=a[i]*b[i];
        System.out.println("The dot product of 2 array are: ");
        for(int i=0;i<n;i++)
            System.out.println(c[i]+"="+a[i]+"."+b[i]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter the elements of the 1st array: ");
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the elements of the 2nd array: ");
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        System.out.print("The array elements of 1st array: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.print("The array elements of 2nd array: ");
        for (int i=0;i<n;i++)
            System.out.print(b[i]+" ");
        System.out.println();
        findDotProduct(a,b,n);
    }
}
