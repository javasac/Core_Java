package com.sachin.HashCodeEquals;

public class HashEquals
{
    int age;
    String name;

    public HashEquals(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o==this)
        {
            return true;
        }
        if (!(o instanceof HashEquals))
        {
            return false;
        }

        HashEquals he = (HashEquals)o;

        if ((this.age==he.age) && (this.name==he.name))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        System.out.println(this.hashCode());
        return this.hashCode();
    }

    public static void main(String args[])
    {
        HashEquals s1 = new HashEquals("Sachin", 25);
        HashEquals s2 = new HashEquals("Sachin", 25);

        if (s1.equals(s2))
        {
            System.out.println("Objects are equal.");
        }
        else
        {
            System.out.println("Objects are not equal.");
        }
    }
}
