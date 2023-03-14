import java.util.*;
public class QTester {
    public static void main(String[] args) {

        Queue <Double> q = new arrQueue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of your Queue?");
        int qSize = sc.nextInt();
            q.size(qSize);

            for (int i = 0; i < q.getSize(); i++)
            {
                System.out.println("Enter a number to add to the queue");
                double numDouble = sc.nextDouble();
                System.out.println();
                q.enqueue(numDouble);
            }
        
        q.print();
        q.dequeue();
        q.dequeue();
        q.print();
        sc.close();
    }
}
