/*
Create a class student with instance variables name,roll,marks and instance methods setData(),display().
Write a Java program to create three objects of student class to input details of three different students
and display the details.
 */

package Assignment1;
import java.util.Scanner;
class Student{
    String name;
    int rollNo;
    double mark;
    public void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name,Roll no and Marks: ");
        name=sc.nextLine();
        rollNo=sc.nextInt();
        mark=sc.nextDouble();
    }
    public void display(){
        System.out.println("Name of the student is "+name);
        System.out.println("Roll no."+rollNo+" marks "+mark);
    }
}
public class A1Q9 {
    public static void main(String[] args) {
        Student ob1=new Student();
        ob1.setData();
        Student ob2=new Student();
        ob2.setData();
        Student ob3=new Student();
        ob3.setData();
        ob1.display();
        ob2.display();
        ob3.display();
    }
}
