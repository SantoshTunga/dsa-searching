package com.dsa.string;

public class KMPStringPatternMatch {

    public static int[] getLSP(String ptn) {
        // Initialize
        int len = 0;
        int[] lps = new int[ptn.length()];
        int i = 1;
        while (i < ptn.length()) {
            // matching case
            if (ptn.charAt(i) == ptn.charAt(len)) {
                lps[i] = ++len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }

        }
        return lps;
    }

    public static void KMPStringMatch(String str, String ptn) {
        int[] lspArray = getLSP(ptn);
        int i = 0, j = 0;

        while (i < str.length()) {

            if (ptn.charAt(j) == str.charAt(i)) {
                i++;
                j++;
                if (j == ptn.length()) {
                    System.out.println("pattern matched at" + (i - j));
                    j = lspArray[j - 1];
                }
            } else {
                if (j != 0) {
                    j = lspArray[j - 1];
                } else {
                    i++;
                }

            }

        }
    }
}
