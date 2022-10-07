package MinorProject01;
import java.util.Scanner;
class LinkedList {
    Node head;
    Scanner in=new Scanner(System.in);

    // Creates a LinkedList
    void create() {
        int n;
        Node node=new Node();
        node.link=null;
        System.out.print("Enter node: [1-Yes & 0-No]: ");
        n=in.nextInt();
        if(n!=1) {
            System.out.println("Empty Linked List created.");
            return;
        }
        System.out.println("Enter head node data value: ");
        node.info=in.nextInt();
        head=node;
        Node node2;
        System.out.print("Enter node: [1-Yes & 0-No]: ");
        n=in.nextInt();
        while(n==1) {
            node2=new Node();
            System.out.println("Enter node data value:");
            node2.info=in.nextInt();
            node2.link=null;
            node.link=node2;
            node=node2;
            System.out.print("Enter node: [1-Yes & 0-No]: ");
            n=in.nextInt();
        }
        System.out.println("Linked List created!\n");
    }
    //Displays Elements of list
    void display() {
        if (checkNotNull()) {
            Node temp=head;
            while(temp!=null) {
                System.out.print(temp.info+"---> ");
                temp = temp.link;
            }
            System.out.println();
        }
    }
    //Finds the 2nd largest info in the list
    int find2ndMax() {
        if (checkNotNull() & checkNotSingle() & checkNotUniValue()) {
            int largest=head.info , second = 0;
            Node temp = head.link;
            while(temp!=null) {
                if (temp.info > largest) {
                    second = largest;
                    largest = temp.info;
                }
                temp = temp.link;
            }
            return second;
        }
        System.out.print("Return 0 because 2nd largest can't be found! - ");
        return 0;
    }
    //Searches for positions of the given input
    void search(int n) {
        if (checkNotNull()) {
            Node temp = head;
            int i=1;
            System.out.print(n+" is present in Nodes(position): [");
            while(temp!=null) {
                if (temp.info==n)
                    System.out.print(i+"");
                i++;
                temp = temp.link;
            }
            System.out.println("]");
        }
    }
    //Removes any node containing duplicate info
    void removeDuplicate() {
        if (checkNotNull() & checkNotSingle()) {
            Node temp1 = head;
            Node temp2;
            while(temp1!=null) {
                temp2 = temp1;
                while (temp2.link!=null) {
                    if (temp2.link.info == temp1.info) {
                        temp2.link = temp2.link.link;
                    }
                    else
                        temp2 = temp2.link;
                }
                temp1 = temp1.link;
            }
        }
    }
    //Counts number of unique elements
    int countUnique() {
        if (checkNotNull()) {
            if (checkNotSingle()) {
                boolean[] arr = new boolean[count()];
                int count=0, i=0,j=0;
                Node temp1 = head;
                Node temp2;
                while (temp1!=null) {
                    temp2 = temp1;
                    while(temp2!=null) {
                        if (i==j && arr[j]==false){
                            arr[j]=true;
                            count++;
                        }
                        if (temp1.info==temp2.info && arr[j]==false){
                            arr[j]=true;
                        }
                        j++;
                        temp2 = temp2.link;
                    }
                    i++;
                    j=i;
                    temp1 = temp1.link;
                }
                return count;
            }
            return 1;
        }
        return 0;
    }
/*
--------------------------------------------------------------------------------------------------------
        Other Methods, that were required
*/

    //Needed in countUnique()
    int count() {
        int count=0;
        Node temp = head;
        while (temp!=null) {
            count++;
            temp = temp.link;
        }
        return count;
    }
    //Needed in all methods except create()
    boolean checkNotNull() {
        if (head==null) {
            System.out.println("THE LINKED LIST IS EMPTY");
            return false;
        }
        return true;
    }
    //Needed in find2ndMax(), removeDuplicate() & countUnique()
    boolean checkNotSingle() {
        if (head.link == null) {
            System.out.println("THIS LIST HAS ONLY SINGLE NODE");
            return false;
        }
        return true;
    }
    //Needed in find2ndMax()
    boolean checkNotUniValue() {
        Node temp = head;
        while (temp.link!=null) {
            if (temp.info!=temp.link.info)
                return true;
            temp = temp.link;
        }
        return false;
    }
}
