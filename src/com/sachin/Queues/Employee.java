package com.sachin.Queues;

class Employee
{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Employee(int sal, String name)
    {
        this.salary = sal;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
