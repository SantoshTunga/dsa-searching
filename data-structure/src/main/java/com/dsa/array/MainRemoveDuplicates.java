package com.dsa.array;

public class MainRemoveDuplicates {

    public static void main(String... args) {
        RemoveDuplicateSortedArray duplicate = new RemoveDuplicateSortedArray();
        int[] a = {1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 9, 9};
        int j = duplicate.removeDuplicate(a);
        for (int i = 0; i <= j; i++) {
            //   System.out.println(" removeDuplicate value "+ a[i]);
        }

        a = new int[]{0, 1, 2, 0, 0, 0, 3, 0};

        duplicate.moveZerosToEnd(a);

        for (int k : a) {
            System.out.println(" moveZerosToEnd value " + k);
        }


    }
}
