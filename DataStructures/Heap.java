package CollectionsInJava.DataStructures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {
    
    public static void main(String[] args) {
        
        // priority queue needs an comparator.
        PriorityQueue<Integer> q=new PriorityQueue<>( new Comparator<Integer>() {
            public int compare(Integer a , Integer b)
            {
                if(a<b) return -1;
                else if (a>b) return 1;
                return 0;
            }
        });

        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->a-b);

        pq.offer(10);
        pq.offer(20);
        pq.offer(-10);

        System.out.println(pq); // even though a pq is a heap , it doesnt print in sorted order.
        // it can only poll in sorted order.

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        

    }
}
