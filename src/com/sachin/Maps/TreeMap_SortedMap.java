package com.sachin.Maps;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_SortedMap
{
    SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);

    TreeMap_SortedMap()
    {
        map.put(87, "Sachin");
        map.put(86, "Rohit");
        map.put(73, "Virat");
        map.put(96, "Rahul");
        map.put(88, "Kapil");
    }

    void printMap()
    {
        System.out.println(map);

        for (Object key : map.keySet())
        {
            System.out.println(key.toString() + " = " + map.get(key));
        }
    }

    void printHeadTail()
    {
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(88));   //exclude
        System.out.println(map.tailMap(87)); //include
    }

    public static void main(String[] args)
    {
        TreeMap_SortedMap ts = new TreeMap_SortedMap();
        //ts.printMap();
        ts.printHeadTail();
    }
}
