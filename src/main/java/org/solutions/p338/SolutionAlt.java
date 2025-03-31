package org.solutions.p338;

public class SolutionAlt {

    public int[] countBits(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = countRealBits(i);
        }
        return res;
    }

    public int countRealBits(int n) {
        int mask = 0b00000000_00000000_00000000_00000001;
        int idx = 0;
        int res = 0;
        while (n > 0) {
            res += n & mask;
            n = n >> 1;
        }
        return res;
    }
}
