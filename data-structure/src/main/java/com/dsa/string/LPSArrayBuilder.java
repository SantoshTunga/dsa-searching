package com.dsa.string;

public class LPSArrayBuilder {

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
}
