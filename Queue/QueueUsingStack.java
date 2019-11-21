package D.S.Queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> s1 = new Stack();
    static Stack<Integer> s2 = new Stack();
    static void insert(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    static int delete(){
        if(s1.isEmpty()){
            System.out.println("Queue Is Empty");
        }
        int x = s1.peek();
        s1.pop();
        return x;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No. of Elemnts to insert in Queue");
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            insert(s.nextInt());
        }

    }
}
