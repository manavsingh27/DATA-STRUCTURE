package D.S.Queue;

public class CircularQueue {
    private static int cq[];
    private static int size;
    private static int front = -1;
    private static int rear = -1;
    CircularQueue(int size){
        front = rear = -1;
        this.size=size;
        cq=new int[size];
    }
    static void insert(int value) {
        if((rear == size-1 &&front == 0)||(rear==front-1)) {
            System.out.println("Queue is Full");
        }
        else if(front == -1) {
            front = rear =0;
            cq[rear] =value;
        }
        else if (front!=0&&rear==size-1) {
            rear =0;
            cq[rear] =value;
        }
        else {
            rear++;
            cq[rear] = value;

        }
    }
    static void delete() {
        if(front == -1) {
            System.out.println("Que  is Empty");
            return;
        }
        cq[front] = -1;
        if(front ==rear) {
            front = -1;
            rear = -1;
        }
        else if (front == size -1) {
            front =0;
        }
        else {
            front ++;
        }
    }
    static void display() {
        if(front == -1) {
            System.out.println("Que  is Empty");
            return;
        }
        if(rear>=front) {
            for (int i=front ; i<=rear ; i++) {
                System.out.print(cq[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = front; i < size; i++)
                System.out.print(cq[i]+" ");
            System.out.println();
            for (int i = 0; i <= rear; i++)
                System.out.print(cq[i] + " ");
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.delete();
       circularQueue.display();
    }
}
