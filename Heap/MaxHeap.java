package D.S.Heap;

public class MaxHeap {
    private int capacity;
    private int size;
    private int heap[];
    private int front = 1;
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[this.capacity + 1];
        heap[0] = Integer.MAX_VALUE;
    }
    public int parent(int pos) {
        return pos/2;
    }
    public int leftChild(int pos) {
        return 2*pos;
    }
    public int rightChild(int pos) {
        return 2*pos+1;
    }
    public void swap(int i1,int i2) {
        int temp;
        temp =heap[i1];
        heap[i1] = heap[i2];
        heap[i2] = temp;
    }
    public boolean isLeaf(int pos) {
        if((pos>=size/2) && (pos<=size)) {
            return true;
        }
        return false;
    }
    public void maxHeapify(int pos) {
        if(!isLeaf(pos)) {
            if((heap[pos] < heap[leftChild(pos)]) || (heap[pos] < heap[rightChild(pos)])) {
                if(heap[leftChild(pos)] > heap[rightChild(pos)]) {
                    swap(pos,leftChild(pos));
                    maxHeapify(leftChild(pos));
                }
                else {
                    swap(pos,rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }
    public void insert(int data) {
        if(size>=capacity) {
            System.out.println("cannot be inserted");
            return;
        }
        size++;
        heap[size] = data;
        int current = size;
        while(heap[current] > heap[parent(current)]) {
            swap(current,parent(current));
            current = parent(current);
        }
    }
    public void delete() {
        heap[front] = heap[size--];
        maxHeapify(front);
    }
    public void print() {
        for(int i=1;i<=size/2;i++) {
            System.out.print("Parent->"+heap[i]+" LeaftChild->"+heap[2*i]+" RightChild->"+heap[2*i+1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        //maxHeap.maxHeap();
        maxHeap.print();
    }
}
