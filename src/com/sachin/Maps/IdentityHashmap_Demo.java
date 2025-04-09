package com.sachin.Maps;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashmap_Demo
{
    public static void main(String[] args)
    {
        String k1 = new String("key");
        String k2 = new String("key");
        Map<String, Integer> map = new IdentityHashMap<String, Integer>();

        map.put(k1, 1);
        map.put(k2, 2);
        map.put("key", 3);

        System.out.println(map);
    }
}
