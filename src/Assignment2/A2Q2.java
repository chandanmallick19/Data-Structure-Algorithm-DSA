/*
Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is: public Complex add(Complex, Complex).
 */

package Assignment2;
import java.util.Scanner;
class Complex {
    int real, imag;

    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary number: ");
        real = sc.nextInt();
        imag = sc.nextInt();
    }

    void display() {
        System.out.println("The complex number is: " + real + " " + imag+"i");
    }

    Complex add(Complex obj1, Complex obj2) {
        Complex obj = new Complex();
        obj.real = obj1.real + obj2.real;
        obj.imag = obj1.imag + obj2.imag;
        return obj;
    }
}
    public class A2Q2 {
        public static void main(String[] args) {
            Complex obj1=new Complex();
            Complex obj2=new Complex();
            obj1.setData();
            obj2.setData();
            Complex obj=obj1.add(obj1,obj2);
            obj.display();
        }
    }

