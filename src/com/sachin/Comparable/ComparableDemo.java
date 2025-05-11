package com.sachin.Comparable;
import java.util.ArrayList;
import java.util.List;

public class ComparableDemo
{
    public static void main(String[] args)
    {
        List<Student> lt = new ArrayList<>();

        lt.add(new Student("Sachin", 4.5));
        lt.add(new Student("Nitin", 3.0));
        lt.add(new Student("Ankit", 3.5));
        lt.add(new Student("Sachin", 4.5));

        lt.sort(null);

        for (Student stud : lt)
        {
            System.out.println(stud.getName() + " " + stud.getGpa());
        }
    }
}
