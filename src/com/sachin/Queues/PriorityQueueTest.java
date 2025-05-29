package com.sachin.Queues;
import java.util.*;

public class PriorityQueueTest
{
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public PriorityQueueTest()
    {
        pq.add(60);
        pq.add(20);
        pq.add(80);
        pq.add(50);
        pq.add(10);
    }

    // print all values
    void printPQ()
    {
        System.out.println("=====Print All Values=====");

        Iterator<Integer> it = pq.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("=====Print All Values=====");
    }

    // polling prints in sorted order
    void pollPQ()
    {
        while (pq.isEmpty()==false)
        {
            System.out.println(pq.poll());
        }
    }

    // explicit sort in reverse
    void orderPrint()
    {
        List<Integer> li = new ArrayList<>(pq);
        System.out.println(li);

        Collections.sort(li, Collections.reverseOrder());

        System.out.println(li);
    }

    public static void main(String[] args)
    {
        PriorityQueueTest pt = new PriorityQueueTest();
        //pt.pollPQ();
        //pt.printPQ();
        pt.orderPrint();
    }
}
