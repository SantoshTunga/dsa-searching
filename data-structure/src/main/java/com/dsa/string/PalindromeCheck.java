package com.dsa.string;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {

        if (str == null || str.isBlank()) {
            return false;
        }
        int l = 0;
        int h = str.length() - 1;

        while (l < h) {
            if (str.charAt(l) == str.charAt(h)) {
                l++;
                h--;
            } else {
                return false;
            }

        }

        return true;
    }
}
