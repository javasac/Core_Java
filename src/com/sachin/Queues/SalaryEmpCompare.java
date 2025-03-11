package com.sachin.Queues;
import java.util.Comparator;

class SalaryEmpCompare implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2)
    {
        //return o1.getSalary() - o2.getSalary();
        return o2.getSalary() - o1.getSalary();
        //return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
