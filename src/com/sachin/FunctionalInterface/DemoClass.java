package com.sachin.FunctionalInterface;

class DemoClass
{
    public static void main(String[] args)
    {
        TestInterface ti = (String a) ->
        {
            System.out.println(a);
        };

        ti.show("Functional Interface with Lambda expression.");
    }
}
