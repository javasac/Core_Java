package com.sachin.Comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortCustom
{
    public static void main(String[] args)
    {
        SortCustom sc = new SortCustom();
        List<Integer> lt = new ArrayList<>();

        lt.add(43);
        lt.add(31);
        lt.add(72);
        lt.add(29);

        System.out.println(lt);

        Comparator<Integer> com = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer i, Integer j)
            {
                return (j > i) ? 1 : -1;
            }
        };

        lt.sort(com);
        System.out.println(lt);
    }
}
