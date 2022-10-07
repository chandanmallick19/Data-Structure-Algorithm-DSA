/*
Rewrite Question 9 with instance method setData() (String,int,double). Use the setData() to initialize members.
 */

package Assignment1;
import java.util.Scanner;
class Students{
    String name;
    int rollNo;
    double mark;
    public void setData(String name,int rollNo,double mark){
        this.name=name;
        this.rollNo=rollNo;
        this.mark=mark;
    }
    public void display(){
        System.out.println("Name "+name+" Roll number "+rollNo+" Marks "+mark);
    }
}
public class A1Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
String[] name=new String[3];
int[] rollNo=new int[3];
double[] mark=new double[3];
for(int i=0;i<3;i++){
    System.out.println("Enter Name,Roll no. and Marks: ");
    name[i]=sc.nextLine();
    rollNo[i]=sc.nextInt();
    mark[i]=sc.nextDouble();
    sc.nextLine();
}
Students ob1=new Students();
Students ob2=new Students();
Students ob3=new Students();
ob1.setData(name[0],rollNo[0],mark[0]);
ob2.setData(name[1],rollNo[1],mark[1]);
ob3.setData(name[2],rollNo[2],mark[2]);
ob1.display();
ob2.display();
ob3.display();
    }
}
