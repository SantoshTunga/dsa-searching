package com.dsa.array;

public class RemoveDuplicateSortedArray {

    public int removeDuplicate(int[] a) {
        int[] r = new int[a.length];
        int j = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[j] != a[i]) {

                a[++j] = a[i];
                // System.out.println(r[j]);
            }

        }
        return j;
    }

    public void moveZerosToEnd(int[] a) {
        //  empty null check
        if (a == null || a.length == 0) {
            return;
        }
        int l = 0;
        int initialZero = -1;

        while (l < a.length - 1) {
            if (a[l] == 0 && initialZero == -1) {

                initialZero = l;
            }

            if (a[l + 1] > 0 && initialZero > -1) {

                int t = a[initialZero];
                a[initialZero] = a[l + 1];
                a[l + 1] = t;

                l = initialZero + 1;
                initialZero = -1;
            } else {
                l++;
            }
        }


    }

}
