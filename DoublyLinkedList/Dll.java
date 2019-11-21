package D.S.DoublyLinkedList;
import java.util.*;
public class Dll {
    private static Node head;
    private static Node tail;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    static void insert_Begin(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            newnode.prev=null;
            head.prev=newnode;
        }
        head=newnode;
        System.out.print("List -: ");
        printlist();
    }
    static void insert_Last(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            tail.next=null;
        }
        System.out.print("List -: ");
        printlist();
    }
    static void delete_Begin(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else {
            head = head.next;
            head.prev=null;
            System.out.print("List -: ");
            printlist();
        }
    }
    static void delete_last(){

        if(head==null||head==tail){
            System.out.println("List is Empty");
        }
        else {
            tail = tail.prev;
            tail.next=null;
            System.out.print("List -: ");
            printlist();
        }
    }
    static void delete_at_index(int index){
        if(head==null){
            System.out.println("List is Empty");
        }
        else {
            if (index == 0) {
                delete_Begin();
            } else {
                Node n = head;
                Node n1 = null;
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                n1 = n.next;
                n1.prev = n;
                n.next = n1.next;
                System.out.print("List -: ");
                printlist();
            }
        }
    }
    static void delete_by_Value(int x){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Node n=head;
            Node n1=null;
            while(n.next!=null){
                if(n.data==x){
                    n=n.next;
                    break;
                }
            }
            n1=n.next;
            n1.prev=n;
            n.next=n1.next;
            System.out.print("List -: ");
            printlist();
        }
    }
    static void printlist(){
        Node newnode=head;
        while(newnode.next!=null){
            System.out.print(newnode.data+" ");
            newnode=newnode.next;
        }
        System.out.print(newnode.data+" ");

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=0; ;i++) {
            System.out.println("\n\nChoose Any Option");
            System.out.println("1.To insert Element At Start at List");
            System.out.println("2.To insert Element At End of the List");
            System.out.println("3.To delete Element from Begin of the List");
            System.out.println("4.To delete Element from End of the List");
            System.out.println("5.To delete any Element of the Linked List");
            System.out.println("6.To delete any Element By value");
            System.out.println("7. To Exit");
            int n=s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter Element to insert");
                    insert_Begin(s.nextInt());
                    break;
                case 2:
                    System.out.println("Enter Element to insert");
                    insert_Last(s.nextInt());
                    break;
                case 3:
                    delete_Begin();
                    break;
                case 4 : delete_last();
                    break;
                case 5 :
                    System.out.println("Enter index to be deleted");
                    delete_at_index(s.nextInt());
                    break;
                case 6 :
                    System.out.println("Enter  value to be Deleted");
                    delete_by_Value(s.nextInt());
                    break;
                case 7:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid  Option");
            }

            }
        }
    }

