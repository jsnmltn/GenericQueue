public class Queue<T> {
    protected int maxSize;
    protected T[] data;
    protected int headIndex = 0;
    protected int tailIndex;
    protected int numberOfElements = 0;

    @SuppressWarnings("unchecked")
    public Queue(){
        data = (T[]) new Object[15];
        tailIndex = data.length -1;
        }

    @SuppressWarnings("unchecked")
    public Queue(int maxSize){
        if (maxSize >= 1){
            data = (T[]) new Object[maxSize];
            tailIndex =  maxSize-1;
        }
        else
            data = (T[]) new Object[15];
            tailIndex = data.length -1;
            maxSize = 15;
    }
    public boolean isEmpty(){
        return (numberOfElements == 0);
    }
    public boolean isFull(){
        return (numberOfElements == data.length);
    }
    public void enqueue(T aData){
        if (!isFull()){
            tailIndex = (tailIndex + 1) % data.length;
            data[tailIndex] = aData;
            numberOfElements++;}
    }
    public T dequeue(){
        if(!isEmpty()){
            T ret = data[headIndex];
            data[headIndex] = null;
            headIndex = (headIndex + 1) % data.length;
            numberOfElements--;
            System.out.println("Queue dequeue: " + ret);
            return ret;
        }
            else{
                System.out.println("Queue is empty");
                return null;
            }
    }
    public int size(){
        return numberOfElements;
    }
    public T peek(){
        if(!isEmpty()){
            return data[headIndex];
        }
        else{
            return null;
        }
    }

    public void print() {
        System.out.println(data[this.headIndex]);
        for (int i = (headIndex + 1) % data.length; i != tailIndex; i = (i + 1) % data.length)
            System.out.println(data[i]);
    }


    
}
