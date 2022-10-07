/*
Write a Java method for finding the smallest and largest numbers in an array
of integers and compare that to a Java method that do the same thing.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q6 {
    public static void findMaxMin(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(max>arr[i])
                max=arr[i];
            if (min<arr[i])
                min=arr[i];
        }
        System.out.println("Maximum= "+max);
        System.out.println("Minimum= "+min);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int x[]={2,6,4,9,1,3};
        System.out.println("The array elements are: ");
        for(int i=0;i<x.length;i++)
            System.out.print(x[i]+"");
        System.out.println();
        findMaxMin(x);
        int max=x[0];
        for(int i=1;i<x.length;i++){
            max=Math.max(max,x[i]);
        }
        System.out.println("Maximum="+max);
        int min=x[0];
        for(int i=1;i<x.length;i++)
            min=Math.min(min,x[i]);
        System.out.println("Minimum="+min);
    }
}
