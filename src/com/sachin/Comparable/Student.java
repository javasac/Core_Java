package com.sachin.Comparable;
import java.util.Objects;

class Student implements Comparable<Student>
{
    private String name;
    private double gpa;

    @Override
    public int compareTo(Student stud)
    {
        return Double.compare(this.getGpa(), stud.getGpa());
    }

    public Student(String name, double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }
    public Student()
    {
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, gpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        Student stud;

        if ((o==null) || (getClass()!=o.getClass()))
        {
            return false;
        }
        else if (this == o)
        {
            return true;
        }
        else
        {
            stud = (Student) o;

            return (stud.getGpa()==this.getGpa() && stud.getName().equals(this.getName())) ? true : false;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
