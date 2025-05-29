package com.sachin.Stack;
import java.util.Stack;

public class Stack_Demo
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);

        System.out.println(st);
        Integer i = st.pop();

        System.out.println(st);
        System.out.println(st.peek());

        System.out.println(st.isEmpty());
        System.out.println(st.size());

        st.add(2, 8875);
        System.out.println(st);
        System.out.println(st.get(2));
        System.out.println(st.search(20));
    }
}
