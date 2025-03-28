package com.sachin.Maps;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class ImmutableMaps
{
    public static void main(String[] args)
    {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);

        // create unmodifiable map
        Map<String, Integer> m2 = Collections.unmodifiableMap(m1);
        //m2.put("C", 3);

        // maximum 10 entries, cannot be updated
        Map<String, Integer> m3 = Map.of("A", 1, "B", 2);
        //m3.put("C", 3);
        System.out.println(m3);

        // add any # of entries
        Map<String, Integer> m4 = Map.ofEntries(Map.entry("A", 1), Map.entry("B", 2), Map.entry("C", 3));
        System.out.println(m4);
    }
}
