package org.solutions.p1137;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> cache = new ArrayList<>();
    {
        cache.add(0);
        cache.add(1);
        cache.add(1);
    }

    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n ==2)
            return 1;

        for (int i = 3; i <= n; i++) {
            cache.add(cache.get(i - 1) + cache.get(i -2) + cache.get(i - 3));
        }
        return cache.get(n);
    }

//    public int recTribonacci(int n) {
//        if (n == 0)
//            return 0;
//        if (n == 1)
//            return 1;
//        if (n == 2)
//            return 1;
//
//        return (recTribonacci(n - 3) + recTribonacci(n - 2) + recTribonacci(n - 1));
//    }
}