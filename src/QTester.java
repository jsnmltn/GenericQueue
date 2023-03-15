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

        List<String> q2 = Arrays.asList("David", "John", "Mary", "Susan", "Kim", "George", "Alan", "Lisa", "Micheal");
        q2.stream().map(str->str.toUpperCase());
        System.out.println("The new Array List of names contains the following names:");
        //print out each element in the array list on a seperate line
        for(String name : q2) {
            System.out.println(name.toUpperCase());
        }
        System.out.println("Now we will use the sort method to organize the names in alphabetical order: ");
        q2.sort(Comparator.naturalOrder());
        for(String name : q2) {
            System.out.println(name.toUpperCase());
        }
        sc.close();
        
        //q2.iteratorforEach(System.out.println(q2);

        
    }
}
