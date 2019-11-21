package D.S.Queue;

import java.util.Scanner;

public class SimpleQueue {
    private static int arr[];
    private static int size;
    private static int front = -1;
    private static int rear = -1;
    SimpleQueue(int size){
        front =0;
        rear = 0;
        this.size=size;
        arr=new int[size];
    }
    static void insert(int value){
        if (size == rear) {
            System.out.println("\nQueue is full\n");
            return;
        }
        else {
            arr[rear] = value;
            rear++;
        }
    }
    static  void delete(){
        if (front == rear) {
            System.out.println("\nQueue is empty\n");
            return;
        }
        else {
            for (int i = 0; i < rear - 1; i++) {
                arr[i] = arr[i + 1];
            }
            if (rear < size)
                arr[rear] = 0;
            rear--;
        }
    }
    static void print(){
        int i;
        if (front == rear) {
            System.out.println("\nQueue is Empty\n");
            return;
        }
        for (i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size Of Queue");
        SimpleQueue queue =new SimpleQueue(s.nextInt());
        for(int i=0; ;i++) {
            System.out.println("Choose Any Option");
            System.out.println("1. To Insert an Element In The Queue");
            System.out.println("2. To delete An Element In the Queue");
            System.out.println("3. To print the Queue");
            System.out.println("4.To Exit.");
            int x=s.nextInt();
            switch (x){
                case 1 :
                    System.out.println("Enter value to be Inserted");
                    queue.insert(s.nextInt());
                    break;
                case 2 : queue.delete();
                    break;
                case 3 : queue.print();
                    break;
                case 4 : System.exit(1);
                    break;
                default :
                    System.out.println("Invalid Option");
            }
        }

    }
}
