/*
Create a class point with instance variables x,y to represent co-ordinates of point and instance
method, setPoint().Write a program to find distance between 2 point using a method findDistance(point,point).
*/

package Assignment1;
import java.util.Scanner;
class point{
    int x,y;
    public void setPoint(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y:");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    public int findDistance(point a1,point a2){
        int distance=(int) Math.sqrt(Math.pow((a1.x-a2.x),2)+Math.pow((a1.y-a2.y),2));
        return distance;
    }
}
public class A1Q11 {
    public static void main(String[] args) {
        point p1=new point();
        point p2=new point();
        p1.setPoint();
        p2.setPoint();
        System.out.println("Distance between ("+p1.x+","+p1.y+") & ("+p2.x+","+p2.y+") is "+p1.findDistance(p1,p2));
    }
}
