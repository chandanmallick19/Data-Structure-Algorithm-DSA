/*
Write a Java class flower that has three instance variables of type string,integer and float,
which repeatedly represent the name of the flower,its number of petals and price. Your class must include
a method  that initializes each variable to an appropriate value and your class should include methods
for setting the value of each type and getting the value of type.
 */

package Assignment1;
import java.util.Scanner;
class flower{
    String name;
    int petals;
    float price;
    public void setName(String name){
        this.name=name;
    }
    public void setPetals(int petals){
        this.petals=petals;
    }
    public void setPrice(float price){
        this.price=price;
    }
}
public class A1Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name,number of petals and price respectively: ");
        String n=sc.nextLine();
        int p=sc.nextInt();
        float pr=sc.nextFloat();
        flower ob=new flower();
        ob.setName(n);
        ob.setPetals(p);
        ob.setPrice(pr);
        System.out.println("Name of the flower: "+ob.name);
        System.out.println("Number of petals: "+ob.petals);
        System.out.println("Price Rs: "+ob.price);
    }
}
