public interface Queue<T> {
    Object arrQueue = null;

    public void enqueue(T aData);

    public T dequeue();

    public T peek();

    public void print();

    public boolean isEmpty();

    public boolean isFull();

    public int getSize();
    public int size(int aSize);

    public void clear();

    public int getElements();

}
