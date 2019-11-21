package CircularQueueUsingArray;
import java.util.*;
public class Main {
    static int front=-1,rear=-1;
    static int queue[]=new int[5];
    static boolean underflow()
    {
        if(front==-1)
            return true;
        else
            return false;
    }
    static boolean overflow()
    {
        if((front==0&&rear==5-1)||(front==rear+1))
            return true;
        else
            return false;
    }
    public static void insert(int x)
    {
        if (overflow()) {
            System.out.println("Queue is Full");
        }


        else {
            if(front==-1){
                front=0;
                rear=0;
                queue[rear]=x;
            }
            if(rear==5-1){
                rear=0;
                queue[rear]=x;
            }
            else{
            rear++;
            queue[rear] = x;}

        }
    }


    static void delete()
    {
        if (underflow()) {
            System.out.println("Queue is Empty");
        }


        else {
              /*  for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i + 1];
                }

                if (rear < 5)
                    queue[rear] = 0;


                rear--;*/
              if(front==rear){
                  front=-1;
                  rear=-1;
              }
              if(front==5-1){
                  front=0;
              }
              else{
            front++;}
        }
    }


    static void print()
    {
        if (underflow()) {
            System.out.println("Queue is Empty");
        }

        for (int i = front; i <=rear; i++) {
            System.out.print(queue[i]+" ");
        }

    }


    public static void main(String[] args)
    {

        insert(20);
        print();
        System.out.println("");
        delete();
        print();


    }
}
