package D.S.LinkedList;
import java.util.*;
public class Linkedlist {
    private static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void insertAtLast(int d){
        Node newnode=new Node(d);
        newnode.next=null;
        if(head==null){
            head=newnode;
        }
        else{
            Node ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
    }
    public static void insertAtFront(int d){
        Node newnode=new Node(d);
        newnode.next=head;
        head=newnode;
    }
    public static void insertAt(int index,int d){
        Node newnode=new Node(d);
        newnode.next=null;
        Node n=head;
        if(index==0){
            insertAtFront(d);
        }
        else {
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            newnode.next=n.next;
            n.next=newnode;
        }
    }
    public static void printLinkedList(){
        Node node=head;
        while (node.next!=null){
            System.out.print(node.data+ " ");
            node=node.next;
        }
        System.out.print(node.data+" ");
    }
    public static void printLinkedListexit(){
        Node node=head;
        while (node.next!=null){
            System.out.print(node.data+ " ");
            node=node.next;
        }
        System.out.print(node.data+ " ");
        System.exit(1);
    }
    public static void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
        }
    }
    public static void reverseList(){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=0;i>=0;i++){
            System.out.println("\n\nChoose Any Option");
            System.out.println("1.To insert Element At Start at Linked List");
            System.out.println("2.To insert Element At End of the Linked List");
            System.out.println("3.To insert Element in Between of the Linked  List");
            System.out.println("4.To delete any Element of the Linked List");
            System.out.println("5.To View The Linked List");
            System.out.println("6.To View and Exit the Program");
            int n=s.nextInt();
            switch (n){
                case 1 : System.out.println("Enter Element");
                         insertAtFront(s.nextInt());
                         break;
                case 2 : System.out.println("Enter Element");
                         insertAtLast(s.nextInt());
                         break;
                case 3 : System.out.println("\nEnter Index at which you want to insert");
                         int x=s.nextInt();
                         System.out.println("Enter Element");
                         int y=s.nextInt();
                         insertAt(x,y);
                         break;
                case 4 : System.out.println("\nEnter Index at which you want to Delete");
                         deleteAt(s.nextInt());
                         break;
                case 5 : printLinkedList();
                         break;
                case 6 : reverseList();
                         break;
                default :
                    System.out.println("Invalid Input");
            }
        }
    }
}
