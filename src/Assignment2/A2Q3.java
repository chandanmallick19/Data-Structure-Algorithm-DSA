/*
Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student . The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.
 */

package Assignment2;
import java.util.Scanner;
class student1{
    int rollNo;
    String name,course;
    void input_student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the student: ");
        name=sc.nextLine();
        System.out.println("Enter student's roll no: ");
        rollNo=sc.nextInt();
        System.out.println("Enter the course name: ");
        course=sc.next();
    }
    void display(){
        System.out.print("Name: "+name+" Roll no: "+rollNo+" Course: "+course);
    }
}
class exam extends student1{
    int mark1,mark2,mark3,sum;
    public void inputMarks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        mark1=sc.nextInt();
        mark2=sc.nextInt();
        mark3=sc.nextInt();
        }
        public void display_result(){
        sum=mark1+mark2+mark3;
            System.out.println(" The result is : "+sum);
        }
    }
public class A2Q3 {
    public static void main(String[] args) {
        exam[] e =new exam[5];
        for(int i=0;i<5;i++){
            e[i]=new exam();
        }
        for(int i=0;i<5;i++){
            e[i].input_student();
            e[i].inputMarks();
            e[i].display();
            e[i].display_result();
        }
    }
}
