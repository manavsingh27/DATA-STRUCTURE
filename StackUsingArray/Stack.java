package D.S.StackUsingArray;
import java.util.*;

class Stack {
    static final int max = 10;
    static int top=-1;
    static int a[] = new int[max];


    static boolean underflow()
    {
        if(top<0)
            return true;
        else
            return false;
    }
    static boolean overflow()
    {
        if(top>(max-1))
            return true;
        else
            return false;
    }


    static void push(int x)
    {
        if (top >= (max - 1)) {
            System.out.println(overflow());
        }
        else {
            top++;
            a[top] = x;


        }
    }

    static int pop()
    {
        if (top < 0) {
            System.out.println(underflow());
            return 0;
        }
        else {
            int x = a[top];
            top--;
            return x;
        }
    }

    static int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Elements in the stack");
        push(s.nextInt());
        push(s.nextInt());
        push(s.nextInt());
        push(s.nextInt());
        push(s.nextInt());
        for(int i=0;i<=top;i++) {
            System.out.println(a[i]);
        }
        System.out.println("Poped Element is "+pop());
        for(int i=0;i<=top;i++) {
            System.out.println(a[i]);
        }
        System.out.println("peek element is "+peek());

        
    }
} 
