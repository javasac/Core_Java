package com.sachin.Maps;
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache
{
    Map<Integer, Integer> map;
    int capacity = 0 ;

    LRUCache(int capacity)
    {
        this.capacity = capacity;

        this.map = new LinkedHashMap<Integer, Integer>(capacity, 1, true)
        {
            protected boolean removeEldestEntry(Map.Entry eldest)
            {
                return size() > capacity;
            }
        };
    }

    int get(int key)
    {
        return map.getOrDefault(key, -1);
    }

    void put(int key, int value)
    {
        map.put(key, value);
    }

    void printMap()
    {
        System.out.println(map);
    }

    public static void main(String[] args)
    {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 10);
        lru.put(2, 20);
        lru.printMap();

        System.out.println(lru.get(2));
        lru.printMap();

        lru.put(3, 30);
        lru.printMap();
    }
}
