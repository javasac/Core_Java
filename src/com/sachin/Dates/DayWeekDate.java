package com.sachin.Dates;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = ld.format(dateFormatter);

        System.out.println("Date is " + formattedDate);
        System.out.println("Day  is " + ld.getDayOfWeek());
    }

    public static void main(String[] args)
    {
        DayWeekDate dw = new DayWeekDate(1, 1, 2000);
        dw.getWeekfromDay();
    }
}
