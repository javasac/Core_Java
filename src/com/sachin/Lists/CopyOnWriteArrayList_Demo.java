package com.sachin.Lists;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class CopyOnWriteArrayList_Demo
{
    CopyOnWriteArrayList<Integer> ls = new CopyOnWriteArrayList<>();

    CopyOnWriteArrayList_Demo()
    {
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
    }

    void removeEven()
    {
        System.out.println(ls);

        for (Integer i : ls)
        {
            if (i % 2 == 0)
            {
                ls.remove(i);
            }
        }

        System.out.println(ls);
    }

    public static void main(String[] args)
    {
        CopyOnWriteArrayList_Demo cw = new CopyOnWriteArrayList_Demo();
        cw.removeEven();
    }
}
