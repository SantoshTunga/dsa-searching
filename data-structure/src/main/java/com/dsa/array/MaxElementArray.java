package com.dsa.array;

public class MaxElementArray {


    public int getSecondHighest(int[] a) {
        if (a == null || a.length < 2) {
            return -99999;
        }
        int max = a[0];
        int previousMax = -9999;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                previousMax = max;
                max = a[i];

            } else if (max > a[i] && previousMax < a[i]) {
                previousMax = a[i];
            }

        }

        return previousMax;

    }

    public int getMaxElementBySinglePointer(int[] a) {
        if (a == null || a.length == 0) {
            return -99999;
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }

        return max;

    }


    public int getMaxElementByTwoPointer(int[] a) {
        if (a == null || a.length == 0) {
            return -99999;
        }
        int l = 0;
        int h = a.length - 1;
        int pointl = 0;
        int pointh = 0;


        while (l <= h) {
            if (a[l] >= a[h]) {
                pointl = a[l];
                h--;
            } else {
                pointh = a[h];
                l++;
            }
        }

        return (Math.max(pointl, pointh));

    }
}
