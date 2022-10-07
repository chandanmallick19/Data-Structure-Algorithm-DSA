/*
Define an interface to declare methods display ( ) & count ( ). Another class contains a static
data member maxcount, instance member name & method display ( ) to display name of a
person, count the no. of characters present in the name of the person.
 */

package Assignment2;
import java.util.Scanner;
interface A{
    void display();
    void count();
}
class B implements A{
    static int maxCount;
    String name;
    B(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name=sc.nextLine();
    }
    public void count(){
        for(int i=0;i<name.length();i++)
            if(name.charAt(i)!=0)
                maxCount++;
    }
    public void display(){
        System.out.println("Name of the person is: "+name);
        System.out.println("Number of character is: "+maxCount);
    }
}
public class A2Q7 {
    public static void main(String[] args) {
        B x1=new B();
        x1.count();
        x1.display();
    }
}
