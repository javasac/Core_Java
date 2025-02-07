package com.sachin.FunctionalInterface;

@FunctionalInterface
interface TestInterface
{
    void show(String a);

    // override any method in Object class. 1 method allowed but Object class methods are allowed.
    String toString();
}
