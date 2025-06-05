package com.dsa.array;

public class MainArray {
    public static void main(String...args)
    {
        //tetstMaxelement();
        tetsArraySorted();
    }

    public static void  tetstMaxelement()
    {
        int [] a = {300,90,10,90,67,300,300,200,89,200,20,6,-1 };
        MaxElementArray max = new MaxElementArray();
        int element = max.getMaxElementByTwoPointer(a);
        System.out.println(" max element is "+ element);

        System.out.println(" max element is "+ max.getMaxElementBySinglePointer(a));

        System.out.println(" getSecondHighest element is "+ max.getSecondHighest(a));
    }

    public static void tetsArraySorted()
    {
        int [] a = {300,90,10,90,67,300,300,200,89,200,20,6,-1 };
        ArrayCheck max = new ArrayCheck();

        System.out.println(" isArraySorted  " + max.isArraySorted(a));

    }
}
