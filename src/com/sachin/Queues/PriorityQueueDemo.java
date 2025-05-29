package com.sachin.Queues;
import java.util.PriorityQueue;

class PriorityQueueDemo
{
    //PriorityQueue<Employee> pq = new PriorityQueue<>(new SalaryEmpCompare());
    PriorityQueue<Employee> pq = new PriorityQueue<>((a, b) -> b.getSalary() - a.getSalary());

    PriorityQueueDemo()
    {
        pq.add(new Employee(300, "Virat"));
        pq.add(new Employee(500, "Rohit"));
        pq.add(new Employee(700, "Sachin"));
        pq.add(new Employee(100, "Rahul"));
        pq.add(new Employee(777, "Kapil Dev"));
    }

    void printPQ()
    {
        //System.out.println("Size is " + pq.size());
        //pq.forEach(System.out::println);

        while (pq.isEmpty()==false)
        {
            System.out.println(pq.poll());
        }
    }

    public static void main(String[] args)
    {
        PriorityQueueDemo demo = new PriorityQueueDemo();
        demo.printPQ();
    }
}
