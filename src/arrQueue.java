import javax.lang.model.util.ElementScanner14;

public class arrQueue<T> implements Queue<T> {
    public static int length;
    private T[] data;
    protected int headIndex = 0;// first element
    protected int tailIndex;// First Null element / 1 past the last element
    protected int elements =0;
    protected int size;
    public static final int DEF_SIZE = 20;

    public arrQueue() {
        this.init(DEF_SIZE);
    }

    public arrQueue(int size) {
        this.init(size);
    }

    @SuppressWarnings("unchecked")
    private void init(int size) {
        if(size >= 1) {
            data = (T[]) (new Object[size]);
        } else
            data = (T[]) (new Object[DEF_SIZE]);
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
