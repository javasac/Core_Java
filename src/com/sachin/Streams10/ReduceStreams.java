package com.sachin.Streams10;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStreams
{
    public static void main(String[] args)
    {
        List<String> str = Arrays.asList("A", "B", "C", "1", "2", "3");

        Optional<String> opt = str.stream().reduce((val, combine) ->
                {return val+combine;}
        );
        System.out.println(opt.get());
    }
}
