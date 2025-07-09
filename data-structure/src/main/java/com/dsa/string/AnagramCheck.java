package com.dsa.string;

import java.util.HashMap;

public class AnagramCheck {

    public static final int CHAR_LEN = 256;

    public static void stringCheck() {
        String str = "abcda";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(" Char at " + str.charAt(i));

            System.out.println(" Char at " + (int) str.charAt(i));
        }

    }

    public static void isAnagramCheckUsingArr(String str, String strCheck) {


    }

    public static void isAnagramCheckUsingMap(String str, String strCheck) {

        HashMap<Character, Integer> strMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(" Char at " + str.charAt(i));
            Integer value = strMap.get(str.charAt(i));
            if (value != null) {
                value++;

            } else {
                value = 1;
            }
            strMap.put(str.charAt(i), value);
            value = strMap.get(strCheck.charAt(i));

            if (value != null) {
                value--;

            } else {
                value = -1;
            }

            strMap.put(str.charAt(i), value);
            System.out.println(" Char at " + (int) str.charAt(i));
        }

    }

    public static int getLeftMostReapingChar(String str) {

        if (str == null || str.isBlank() || str.length() == 1) {
            return -1;
        }

        int[] chars = new int[CHAR_LEN];

        for (int i = 0; i < str.length(); i++) {
            chars[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (chars[str.charAt(i)] > 1) {
                return i;
            }
        }

        return -1;

    }
}
