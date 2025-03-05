package com.sachin.Enums;

public class LevelEnumClass
{
    public static void main(String[] args)
    {
        LevelEnum l2[] = LevelEnum.values();

        for (LevelEnum le : l2)
        {
            System.out.println("Value is " + le + " at index = " + le.ordinal() + ".");
        }
    }
}
