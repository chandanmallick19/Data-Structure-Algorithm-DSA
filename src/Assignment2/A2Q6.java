/*
Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes.
 */

package Assignment2;
import java.util.Scanner;
abstract class Shape{
    double area;
    abstract void area();

    void display() {
        System.out.println("Area is: "+area);
    }}
class square extends Shape{
    void area() {
        Scanner ac=new Scanner(System.in);
        System.out.println("Enter the length and breadth of square: ");
        int l=ac.nextInt();
        int b=ac.nextInt();
        area=l*b;
    }}
class tringle extends Shape{
    int l,b;
    tringle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area() {
        area=0.5*l*b;
    }}
class circle extends Shape{
    int r;
    circle(int r){
        this.r=r;
    }
    void area() {
        area=Math.PI*r*r;
    }}
public class A2Q6 {
    public static void main(String args[]) {
        Shape s1 = new square();
        s1.area();
        System.out.print("Square ");
        s1.display();
        Shape t1 = new tringle(4, 5);
        System.out.print("Triangle ");
        t1.area();
        t1.display();
        Shape c1 = new circle(8);
        System.out.print("Circle ");
        c1.area();
        c1.display();
    }
}
