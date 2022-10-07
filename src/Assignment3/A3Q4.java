/*
Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 */

package Assignment3;
import java.util.Scanner;
class Box<T> {
    public T var;

    Box(T var) {
        this.var = var;
    }

    void setVar(T var) {
        this.var = var;
    }

    T getVar() {
        return var;
    }
}
public class A3Q4 {
    public static void main(String[] args) {
        Box<String> test1;
        test1 = new Box<String>(null);
        Box<String> var1=test1;
        Box<String> var2=test1;
        var1.setVar("Hello User !");
        System.out.println(var1.getVar());
        var2.setVar("Welcome to Java.");
        System.out.println(var1.getVar());
        Box<Integer> test2;
        test2 = new Box<Integer>(null);
        Box<Integer> var3=test2;
        Box<Integer> var4=test2;
        var3.setVar(1);
        System.out.println(var3.getVar());
        var4.setVar(2);
        System.out.println(var3.getVar());
        Box<Object> test3;
        test3 = new Box<Object>(null);
        Box<Object> var5=test3;
        Box<Object> var6=test3;
        var5.setVar((Double)0.1);
        System.out.println(var5.getVar());
        var6.setVar("Value 2");
        System.out.println(var5.getVar());
    }
}
