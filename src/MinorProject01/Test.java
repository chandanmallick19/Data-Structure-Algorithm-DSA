package MinorProject01;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        LinkedList ll = new LinkedList();
        ll.create();
        while(choice!=0) {
            System.out.println("\nEnter choice-"
                    +"\n1.Display,"
                    +"\n2.Find 2nd Largest element"
                    +"\n3.Search occurrences of an element"
                    +"\n4.Remove nodes with duplicate info"
                    +"\n5.Count no. of nodes with distinct info"
                    +"\n0.Stop\n");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Program Stopped!!!"); break;
                case 1:
                    ll.display(); break;
                case 2:
                    System.out.println("Second largest no. is "+ll.find2ndMax());
                    break;
                case 3:
                    System.out.print("Enter element you want to search: ");
                    ll.search(in.nextInt()); break;
                case 4:
                    ll.removeDuplicate(); break;
                case 5:
                    System.out.println("Unique number of elements: "+ll.countUnique());
                    break;
                default:
                    System.out.println("Plz Enter within the given range!"); break;
            }
        }
        in.close();
    }
}
