package Assignment4;
import java.util.Scanner;
class Node{
    protected int regd_no;
    protected float mark;
    protected Node next;
}
public class LinkedList {
    public static Node create(Node start) {
        Scanner sc=new Scanner(System.in);
        char ch;
        Node q=new Node();
        do {
            Node n=new Node();
            System.out.println("Enter Registration number: ");
            n.regd_no=sc.nextInt();
            System.out.println("Enter mark: ");
            n.mark=sc.nextInt();
            n.next=null;
            if (start==null) {
                start=n;
                q=n;
            } else {
                q.next=n;
                q=n;
            }
            System.out.println("Enter Y to add next value in node: ");
            ch=sc.next().charAt(0);
        }
        while (ch=='Y');
            return start;
        }
    public static Node display(Node start) {
        Node n=new Node();
        n=start;
        if (start==null) {
            System.out.println("Empty list.");
        } else {
            System.out.println("List created");
            while (n!=null) {
                System.out.println("Registration number "+n.regd_no+" Mark "+n.mark);
                n=n.next;
            }
        }
        return start;
    }

    //INSERTION AT BEGINNING
    public static Node insBeg(Node start) {
        Scanner sc=new Scanner(System.in);
        Node n=new Node();
        System.out.println("Enter registration number and marks: ");
        n.regd_no=sc.nextInt();
        n.mark=sc.nextFloat();
        n.next=start;
        start=n;
        return start;
    }

    //INSERTION AT THE END
    public static Node insEnd(Node start) {
        Scanner sc=new Scanner(System.in);
        Node n=new Node();
        Node a=new Node();
        System.out.println("Enter Registration number and marks");
        a.regd_no=sc.nextInt();
        a.mark=sc.nextFloat();
        n=start;
        a.next=null;
        while (n.next!=null) {
            n=n.next;
        }
        n.next=a;
        return start;
    }

    //INSERTION AT ANY POSITION
    public static Node insAny(Node start) {
        Scanner sc=new Scanner(System.in);
        Node n=new Node();
        Node a=new Node();
        System.out.println("Enter Registration number and marks");
        a.regd_no=sc.nextInt();
        a.mark=sc.nextFloat();
        n=start;
        a.next=null;
        System.out.println("Enter location");
        int loc=sc.nextInt();
        for (int i=1; i<loc-1&&n.next!=null;i++) {
            n=n.next;
        }
        a.next=n.next;
        n.next=a;
        return start;
    }

    // SEARCH A NODE
    public static Node search(Node start) {
        Node n=new Node();
        n=start;
        if(start==null) {
            System.out.println("List is empty.");
        } else {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Registration number to search");
            int q=sc.nextInt();
            while (n!=null) {
                if (q==n.regd_no) {
                    System.out.print("Enter marks to be updated");
                    n.mark=sc.nextFloat();
                }
                n=n.next;
            }
        }
        return start;
    }

    // DELETION AT BEGINNING
    public static Node delBeg(Node start) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Node to  deleted  " + start.regd_no + " " + start.mark + "at" + start);
        start=start.next;
        System.out.println(start);
        return start;
    }
    //DELETION AT END
    public static Node delEnd(Node start){
        Scanner sc=new Scanner (System.in);
        Node n=start;
        Node o=new Node();
        while(n.next!=null){
            o=n;
            n=n.next;
        }
        System.out.println("Element to be deleted "+n.regd_no+" "+n.mark+" at "+n);
        o.next=null;
        return start;
    }
    //DELETION AT ANY POSITION
    public static Node delAny(Node start){
        Scanner sc=new Scanner (System.in);
        Node n=start;
        Node q=new Node();
        System.out.println("Enter location");
        int l=sc.nextInt();
        for(int i=1;i<l && n.next!=null;i++){
            q=n;
            n=n.next;
        }
        q.next=n.next;
        return start;
    }
    // REVERSE THE NODE
    public static Node rev(Node start){
        Scanner sc=new Scanner (System.in);
        Node n=new Node();
        Node o=new Node();
        Node p=new Node();
        n=start;
        o=null;
        while(n!=null){
            p=n.next;
            n.next=o;
            o=n;
            n=p;
        }
        start=o;
        return start;
    }
    //SORTING THE NODE
    public static Node sort(Node start){
        Node n=start;
        Node o=new Node();
        while(n.next!=null){
            o=n.next;
            if(n.mark<o.mark){
                float t=n.mark;
                n.mark=o.mark;
                o.mark=t;
            }
            n=n.next;
        }
        return start;
    }
    // MAIN METHOD
    public static void main(String[] args) {
        int c;
        Scanner sc=new Scanner (System.in);
        Node start=null;
        while(true) {
            System.out.println("****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insert at beg");
            System.out.println("4:Insert at end");
            System.out.println("5:Insert at specific location");
            System.out.println("6:Search");
            System.out.println("7:Delete at beg");
            System.out.println("8:Delete at end");
            System.out.println("9:Delete at specific location");
            System.out.println("10:Reverse the list");
            System.out.println("11:Sorting the list");
            System.out.println("Enter the choice: ");
            c=sc.nextInt();
            switch(c)   {
                case 0:
                    System.exit(0);
                case 1:
                    start=create(start);
                    break;
                case 2:
                    start=display(start);
                    break;
                case 3:
                    start=insBeg(start);
                    break;
                case 4:
                    start=insEnd(start);
                    break;
                case 5:
                    start=insAny(start);
                    break;
                case 6:
                    start=search(start);
                    break;
                case 7:
                    start=delBeg(start);
                    break;
                case 8:
                    start=delEnd(start);
                    break;
                case 9:
                    start=delAny(start);
                    break;
                case 10:
                    start=rev(start);
                    break;
                case 11:
                    start=sort(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
