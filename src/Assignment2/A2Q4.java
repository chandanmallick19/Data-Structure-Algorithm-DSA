/*
A point in the x-y plane is represented by its x-coordinate and y-coordinate. Design a class,
PointType in Java, that can store and process a point in the x-y plane. You should then
perform operations on the point, such as showing the point, setting the coordinates of the
point, printing the coordinates of the point, returning the x-coordinate, and returning the y-coordinate.
Every circle has a center and a radius. Given the radius, we can determine the
circle’s area and circumference. Given the center, we can determine its position in the x-y
plane. The center of a circle is a point in the x-y plane. Design a class, CircleType that can
store the radius and center of the circle. Because the center is a point in the x-y plane and
you designed the class to capture the properties of a point from PointType class. You must
derive the class CircleType from the class PointType. You should be able to perform the
usual operations on a circle, such as setting the radius, printing the radius, calculating and
printing the area and circumference, and carrying out the usual operations on the center.
 */

package Assignment2;
import java.util.Scanner;

class pointType{
    int x,y;
    void coordinate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the coordinate[x,y]= ");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    void display_coordinate(){
        System.out.println("Coordinate is=("+x+","+y+")");
    }
}
class circleType extends pointType{
    double r;
    void distance(pointType p1,pointType p2){
        r=Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
    }
    void Display_area(){
        System.out.println("Area is="+3.141*r*r);
    }
    void Display_circumference(){
        System.out.println("Circumferece is="+2*3.141*r);
    }
}
public class A2Q4 {
    public static void main(String[] args) {
        pointType p1=new pointType();
        pointType p2=new pointType();
        p1.coordinate();
        p2.coordinate();
        p1.display_coordinate();
        p2.display_coordinate();
        circleType c1=new circleType();
        c1.distance(p1,p2);
        c1.Display_area();
        c1.Display_circumference();
    }
}
