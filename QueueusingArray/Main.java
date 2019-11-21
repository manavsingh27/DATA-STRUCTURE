package QueueusingArray;
import java.util.*;
public class Main {
    static int front=-1,rear=-1;
    private static int queue[]=new int[5];
    static boolean underflow()
    {
        if(front==rear)
            return true;
        else
            return false;
    }
    static boolean overflow()
    {
        if(rear>=5)
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
                rear++;
                queue[rear] = x;

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
              front++;
            }
        }


        static void print()
        {
            if (underflow()) {
                System.out.println("Queue is Empty");
            }

            for (int i = front+1; i <=rear; i++) {
                System.out.print(queue[i]+" ");
            }

        }


        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            insert(20);
            insert(30);
            insert(40);


            print();
            System.out.println("");

            delete();
            delete();
            insert(20);
            print();
        }
    }
