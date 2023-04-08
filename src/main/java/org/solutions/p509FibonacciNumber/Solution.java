package org.solutions.p509FibonacciNumber;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Integer, Long> map = new HashMap<>();
    public long fib(int n) {

        if(n==0)
            return 0;

        if(n==1)
            return 1;

        if(map.containsKey(n))
            return map.get(n);

        long val = fib(n-1) + fib(n-2);
        map.put(n, val);

        return val;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.fib(50));
        System.out.println(sol.fib(60));
//        System.out.println(sol.fib(n));
//        System.out.println(sol.fib(n));
//        System.out.println(sol.fib(n));
    }
}