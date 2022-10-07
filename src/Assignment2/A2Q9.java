/*
Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input( ) & output( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input( ), output( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class
 */

package Assignment2;
import java.util.Scanner;
class Student{
        String name;
        int rollNo;
        Scanner sc=new Scanner(System.in);
        void input(){
                System.out.println("Enter name and roll number: ");
                name=sc.nextLine();
                rollNo=sc.nextInt();
        }
        void output(){
            System.out.println("Name of the student is: "+name);
            System.out.println("The roll number of the student is: "+rollNo);
        }
}
public class A2Q9 {


    }



