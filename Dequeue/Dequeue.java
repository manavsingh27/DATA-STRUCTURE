package D.S.Dequeue;
import java.util.*;
public class Dequeue {
    static int dequeue[]=new int[10];
    public static int size=10;
    static int front=-1;
    static int rear=0;
    static boolean overflow(){
        if((front == 0 && rear == size-1)|| front == rear+1)
            return true;
        else
            return false;
    }
    static boolean underflow(){
        if(front == -1)
            return true;
        else
            return false;
    }
    static void inserAtFront(int x){
        if(overflow()){
            System.out.println("Dequeue is Full");
        }
        if (front == -1)
        {
            front=0;
            rear=0;
        }
        else if (front == 0) {
            front=size - 1;
        }

        else {
            front=front - 1;
        }
        dequeue[front]=x;
    }
    static void insertAtrear(int x){
        if(overflow()){
            System.out.println("Dequeue is Full");
        }
            if (front == -1){
                front = 0;
                rear = 0;
            }
            else if (rear == size-1) {
                rear = 0;
            }
            else {
                rear = rear + 1;
            }
            dequeue[rear] = x ;
    }
    static void deleteAtFront()
    {
        if (underflow())
        {
            System.out.println("Dequeue is Empty");
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if (front==size-1) {
                front=0;
            }
            else {
                front++;
            }
    }
    static void deleteAtrear()
    {
        if (underflow())
        {
            System.out.println("Dequeue iis Empty");
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if (rear == 0) {
            rear = size - 1;
        }
        else {
            rear--;
        }
    }
    static void print()
    {
        if (underflow()) {
            System.out.println("Dequeue is Empty");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.print(dequeue[i] + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        for(int i=0;i>=0;i++) {
            System.out.println("\n \n");
            System.out.println("Choose Any Option");
            System.out.println("1.To insert Element at Front");
            System.out.println("2.To insert Element at Last");
            System.out.println("3..To delete Element from Front");
            System.out.println("4.To delete Element from Last");
            System.out.println("5.To Print the Dequeue");
            System.out.println("6.To Exit");
            int n=s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter Element");
                    inserAtFront(s.nextInt());
                    break;
                case 2:
                    System.out.println("Enter Element");
                    insertAtrear(s.nextInt());
                    break;
                case 3:
                    deleteAtFront();
                    break;
                case 4:
                    deleteAtrear();
                    break;
                case 5 :
                    print();
                    break;
                case 6 :
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
