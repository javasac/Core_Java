package com.sachin.Maps;
import java.util.Map;
import java.util.Set;

public class HashMap
{
    java.util.HashMap<Integer, String> hm = new java.util.HashMap<>();

    private HashMap()
    {
        hm.put(1, "Sachin");
        hm.put(2, "Kapil");
        hm.put(3, "Elon");
    }

    void printForEach()
    {
        hm.forEach((key, value) -> System.out.print(key + " = " + value));
    }

    void printKeySet()
    {
        System.out.println();

        for (Object key : hm.keySet())
        {
            System.out.print(key.toString() + " = " + hm.get(key));
            hm.replace(Integer.parseInt(key.toString()), hm.get(key) + " Kansal");
        }
        System.out.println();
    }

    // print using default and check contains for key and value
    void printDefaultSOUT()
    {
        // check existence
        System.out.println("Sachin Kansal is present = " + hm.containsValue("Sachin"));
        System.out.println("Key 1 is present = " + hm.containsKey(1));
        hm.remove(3);
        System.out.println(hm);
    }

    void printEntrySet()
    {
        Set<Map.Entry<Integer, String>> ent = hm.entrySet();

        for (Map.Entry<Integer, String> entry : ent)
        {
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println("Key is " + entry.getKey() + " and Value = " + entry.getValue());
        }
    }

    public static void main(String[] args)
    {
        HashMap hm = new HashMap();
        hm.printForEach();
        hm.printKeySet();
        hm.printDefaultSOUT();
        hm.printEntrySet();
    }
}
