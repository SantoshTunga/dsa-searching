package com.dsa.string;

import java.util.Arrays;

public class StringMain {

    public static void main(String... args) {
        //System.out.println(" is palindrome " + PalindromeCheck.isPalindrome("KAAK"));
        //System.out.println(" is palindrome " + PalindromeCheck.isPalindrome("KtAATK"));

        // AnagramCheck.stringCheck();

        //final String str = "tabbbbaccc";
        // int position = AnagramCheck.getLeftMostReapingChar(str);
        // System.out.println(str + " getLeftMostReapingChar position : " + position);
        int[] lsp = LPSArrayBuilder.getLSP("ababcb");
        Arrays.stream(lsp).forEach(rec -> System.out.print(rec));
    }
}
