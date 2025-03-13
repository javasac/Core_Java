package com.sachin.Dates;
import java.time.LocalDate;
import java.util.GregorianCalendar;

class DayWeekDate
{
    int day;
    int month;
    int year;

    DayWeekDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void getWeekfromDay()
    {
        LocalDate ld = LocalDate.of(this.year, this.month, this.day);
        System.out.println("Date is " + ld.toString());
        System.out.println("Day is " + ld.getDayOfWeek());
    }

    void GregorianCal()
    {
        GregorianCalendar gc = new GregorianCalendar(this.year, this.month, this.day);
        System.out.println("Date is " + gc.getGregorianChange());
        System.out.println("Weeks in year are " + gc.getWeeksInWeekYear());
    }

    public static void main(String[] args)
    {
        DayWeekDate dw = new DayWeekDate(31, 1, 2002);
        dw.getWeekfromDay();
        //dw.GregorianCal();
    }
}
