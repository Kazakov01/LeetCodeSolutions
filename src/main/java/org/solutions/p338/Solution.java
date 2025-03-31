package org.solutions.p338;

public class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = countRealBits(i);
        }
        return res;
    }

    public int countRealBits(int n) {
        int idx = 0;
        int res = 0;
        while (idx < 32) {
            int mask = 0b00000000_00000000_00000000_00000001;
            mask = mask << idx;
            if ((mask & n) > 0) {
                res++;
            }
            idx++;
        }
        return res;
    }

}
