package LinkedList;
import java.util.*;
public class PallindromeLinkedList {
    private static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static PallindromeLinkedList insertAtLast(PallindromeLinkedList l1,int d){
        Node newnode=new Node(d);
        newnode.next=null;
        if(l1.head==null){
            l1.head=newnode;
        }
        else{
            Node ptr=l1.head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
        return l1;
    }
    public static PallindromeLinkedList reverseList(PallindromeLinkedList l1){
        Node curr=l1.head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        l1.head=prev;
        return l1;

    }
    public static void printLinkedList(PallindromeLinkedList l){
        Node node=l.head;
        while (node.next!=null){
            System.out.print(node.data+ " ");
            node=node.next;
        }
        System.out.print(node.data+" ");
    }
    public static boolean checkPallindrome(PallindromeLinkedList l1,PallindromeLinkedList l2){
        Node n1=l1.head;
        Node n2=l2.head;
        int c=0;
        System.out.println("CCCC"+n1.data);
        System.out.println(n2.data);
        int x=0;

        while(n1!=null&&n2!=null){
            if(n1.data==n2.data){
                x++;
            }
            n1=n1.next;
            n2=n2.next;
            c++;
        }

        if(c==x) {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        PallindromeLinkedList l=new PallindromeLinkedList();
        l=insertAtLast(l,s.nextInt());
        l=insertAtLast(l,s.nextInt());
        l=insertAtLast(l,s.nextInt());
        l=insertAtLast(l,s.nextInt());
        l=insertAtLast(l,s.nextInt());
        PallindromeLinkedList l2=new PallindromeLinkedList();
        printLinkedList(l);
        l2=reverseList(l);
        System.out.println("");
        printLinkedList(l2);
        if(checkPallindrome(l,l2)){
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }

    }
}
