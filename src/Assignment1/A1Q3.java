/*
Write a Java program that outputs all possible strings formed by using the characters 'c',
'a', 'r', 'b', 'o', and 'n' exactly once.
 */
package Assignment1;
public class A1Q3 {
    public static void main(String[] args) {
       char arr[]={'c','a','r','b','o','n'};
       int i,j,k,l,m,n;
       int count=0;
       for(i=0;i<arr.length;i++)
       for(j=0;j<arr.length;j++)
       for(k=0;k<arr.length;k++)
       for(l=0;l<arr.length;l++)
       for(m=0;m<arr.length;m++)
       for(n=0;n<arr.length;n++){
           if(i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&j!=k&&j!=l&&j!=m&&j!=n&&k!=l&&k!=m&&k!=n&&l!=m&&l!=n&&m!=n){
               System.out.println(arr[i]+""+arr[j]+""+arr[k]+""+arr[l]+""+arr[m]+""+arr[n]+"");
               count++;
           }
       }
        System.out.println(count);
    }
}