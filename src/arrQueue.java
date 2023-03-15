//Written By Jason Milton
/* 
public class arrQueue<T> implements Queue<T> {
    public static int length;
    protected T[] data;
    protected int headIndex = 0;// first element
    protected int tailIndex;// First Null element / 1 past the last element
    protected int elements =0;
    protected int size;
   
    @SuppressWarnings("unchecked")
    public arrQueue() {
        data = (T[]) new arrQueue[10];
        tailIndex = data.length - 1;
    }
    @SuppressWarnings("unchecked")
    public arrQueue(int size) {
        if (size >= 1) {
            data = (T[]) (new Object[size]);
            tailIndex = size- 1;
        } else
            data = (T[]) (new Object[10]);
            tailIndex = data.length - 1;
    }

    public int size(int size) {
        return size;
    }

    @Override
    public void enqueue(T aData) {
        if(!isFull())
            tailIndex = (tailIndex + 1) % data.length; 
          // Note: we are dividing integers, and we want the remainder value not the quotient.
            data[tailIndex] = aData;
            elements++;
            System.out.println(aData + " added to the queue");
        if (isFull())
            System.out.println("Queue is full");
        return;
    }
    @Override
    public T dequeue() {
        T ret = data[headIndex];
        data[headIndex] = null;
        headIndex = (headIndex + 1) % data.length;
        elements--;
        return ret;
    }

    public T peek() {
        return data[headIndex];
    }

    public void print() {
        System.out.println(data[this.headIndex]);
        for (int i = (this.headIndex + 1) % data.length; i != this.tailIndex; i = (i + 1) % data.length)
            System.out.println(data[i]);
    }

    @Override
    public boolean isEmpty() {
        return (elements == 0);
    }

    public boolean isFull() {
        return (size-1 == elements);
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.size -1; i++) {
            this.dequeue();
        }
        return;
    }

    public int getSize() {
        return this.size;
    }
    public int getElements(){
        return this.elements;
    }


}
*/
