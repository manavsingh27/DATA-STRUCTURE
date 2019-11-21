package D.S.Heap;

public class MinHeap {
    private int capacity;
    private int size;
    int heap[];
    private int front =1;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[this.capacity +1];
       // heap[0] = Integer.MIN_VALUE;
    }

    public int parent(int pos) {
        return pos/2;
    }
    public int leftchild(int pos) {
        return 2*pos;
    }
    public int rightchild(int pos) {
        return 2*pos+1;
    }
    public boolean isLeaf(int pos) {
        if((pos>=size/2)&&(pos<=size)) {
            return true;
        }
        return false;
    }
    public void swap(int i1,int i2) {
        int temp;
        temp = heap[i1];
        heap[i1] = heap[i2];
        heap[i2] = temp;
    }
    public void minHeapify(int pos) {
        if(!isLeaf(pos)) {
            if(heap[pos] > heap[leftchild(pos)] || heap[pos] > heap[rightchild(pos)]) {
                if(heap[leftchild(pos)] < heap[rightchild(pos)]) {
                    swap(pos,leftchild(pos));
                    minHeapify(leftchild(pos));
                }
                else {
                    swap(pos,rightchild(pos));
                    minHeapify(rightchild(pos));
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
        while (heap[current] < heap[parent(current)]) {
            swap(current,parent(current));
            current = parent(current);
        }
    }
    /*public void minHeap() {
        for(int pos = size/2;pos>=1;pos--) {
            minHeapify(pos);
        }
    }*/
    public void delete() {
        heap[front] = heap[size--];
        minHeapify(front);
    }
    public void print() {
        for(int i=1;i<=size/2;i++) {
            System.out.print("Parent->"+heap[i]+" LeftChild->" + heap[2*i]+" RightChild->"+heap[2*i+1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
      //  minHeap.minHeap();

        minHeap.print();
    }

}
