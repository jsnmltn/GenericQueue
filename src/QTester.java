import java.util.*;
public class QTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of your Queue?");
        int qSize = sc.nextInt();
            Queue<Integer> q = new Queue<>(qSize);

            while(!q.isFull())
            {
                System.out.println("Enter a number to add to the queue");
                Integer aData = sc.nextInt();
                q.enqueue(aData);
                
            }
       // print the entire array here
        System.out.print("The Queue is full. Here is the Queue: ");
        q.print();  
        System.out.println(); // skip a line for readability
        q.dequeue();
        System.out.println(); // skip a line for readability
        System.out.println("Number of items in the Queue: " +q.size());
        System.out.println("Next element in the que has a value of: "+ q.peek());
        System.out.println(); // skip a line for readability
        q.dequeue();
        System.out.println("Number of items in the Queue: " + q.size());
        System.out.println("Next element in the que has a value of: " + q.peek());


        sc.close();
    }
}
