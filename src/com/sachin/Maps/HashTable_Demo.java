package com.sachin.Maps;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashTable_Demo
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        //Hashtable<Integer, String> map = new Hashtable<>();
        //ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Thread th1 = new Thread(() -> {
            for (int i=1; i<=1000; i++)
            {
                map.put(i, "Thread-1");
            }
        });
        Thread th2 = new Thread(() -> {
            for (int i=1001; i<=2000; i++)
            {
                map.put(i, "Thread-2");
            }
        });

        th1.start();
        th2.start();

        try
        {
            th1.join();
            th2.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println(map);
        System.out.println("Final Size of Map = " + map.size());
    }
}
