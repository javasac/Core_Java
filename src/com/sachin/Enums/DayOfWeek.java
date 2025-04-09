package com.sachin.Enums;

public enum DayOfWeek
{
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int dayNumber;

    // Constructor
    DayOfWeek(int dayNumber)
    {
        this.dayNumber = dayNumber;
    }

    // Getter method
    public int getDayNumber()
    {
        return dayNumber;
    }

    public static void main(String[] args)
    {
        for (DayOfWeek day : DayOfWeek.values())
        {
            System.out.println(day + " = " + day.getDayNumber());
        }
    }
}