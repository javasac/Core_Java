package com.sachin.Comparator;
import java.util.Comparator;

public class NumberCompare implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        // descending order
        //return o2 - o1;
        // ascending order
        return o1 - o2;
    }
}
