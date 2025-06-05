package com.dsa.array;

public class ArrayCheck {

    public boolean isArraySorted(int[] a) {
        int l = 0;
        int h = a.length - 1;


        while (l <= h) {
            int mid = (l + h) / 2; // check how we can avoid overflow

            if (a[mid] >= a[l]) {
                h = mid - 1;
            } else {
                return false;
            }
        }

        l = 0;
        h = a.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2; // check how we can avoid overflow

            if (a[mid] <= a[h]) {
                l = mid + 1;
            } else {
                return false;
            }
        }

        return true;

    }
}
