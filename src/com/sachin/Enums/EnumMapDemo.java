package com.sachin.Enums;
import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo
{
    public static void main(String[] args)
    {
        Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);

        map.put(DayOfWeek.SUNDAY, "Movie");
        map.put(DayOfWeek.MONDAY, "Office");

        System.out.println(map.get(DayOfWeek.MONDAY));

        System.out.println(map);
    }
}
