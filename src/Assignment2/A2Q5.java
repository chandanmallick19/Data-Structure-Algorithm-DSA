/*
Let a class Person contains data members name and age. A constructor with two arguments
is used to assign name and age. Person is of two types a) Student and b) Teacher. class
Student contains data members i)course ii) Roll Number and iii)Marks and method
display() to display data related to student. Similarly, class Teacher contains data members
i) subject_assigned (May take this as a String) ii) contact_hour and method display () to
display data related to teacher. Implement this program using base class constructor in
derived class
 */

package Assignment2;
import java.util.Scanner;
class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age+"yrs");
    }
}
class student extends person{
    String course;
    int roll,mark;
    student(String n,int a,int roll,int mark,String course){
        super(n,a);
        this.course=course;
        this.roll=roll;
        this.mark=mark;
    }
    void student_display() {
        super.display();
        System.out.println("Course is: "+course);
        System.out.println("Roll NO.is: "+roll);
        System.out.println("Mark is: "+mark);
    }}
class Teachers extends person{
    int contact_hour;
    String assignment;
    Teachers(String n,int a,int contact_hour,String assignment){
        super(n,a);
        this.contact_hour=contact_hour;
        this.assignment=assignment;
    }
    void teacher_display() {
        super.display();
        System.out.println("Contact Hour is: "+contact_hour);
        System.out.println("Assignment is: "+assignment);
    }}
public class A2Q5 {
    public static void main(String[] args) {
        System.out.println("STUDENT'S DATA");
        student s1 = new student("Chandan Ku. Mallick", 23, 18, 90, "CSE");
        s1.student_display();
        System.out.println("TEACHER'S DATA");
        Teachers t1 = new Teachers("CKM", 30, 03, "DSA");
        t1.teacher_display();
    }
}
