package com.sachin.Maps;
import java.util.WeakHashMap;

public class WeakHashMap_Demo
{
    public static void main(String[] args)
    {
        WeakHashMap<String, WeakHashMap_Image> imageCache = new  WeakHashMap(0);

        imageCache.put(new String("img1"), new WeakHashMap_Image("Image 1"));
        imageCache.put(new String("img2"), new WeakHashMap_Image("Image 2"));

        System.out.println(imageCache);
        System.gc();
        simulateSleep();
        System.out.println("Entries may be cleared = " + imageCache);
    }

    private static void simulateSleep()
    {
        try
        {
            System.out.println("simulateSleep.........");
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
