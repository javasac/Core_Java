package com.sachin.Comparator;
import java.util.ArrayList;
import java.util.Collections;
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
                if (j%10 > i%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };

        Collections.sort(lt, com);

        System.out.println(lt);
    }
}
