package org.solutions.p605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int f = n;

        for (int i = 0; i < flowerbed.length ; i++) {
            int prev = i > 0 ? flowerbed[i - 1] : 0;
            int curr = flowerbed[i];
            int next = i < flowerbed.length - 1 ? flowerbed[i + 1] : 0;

            if (prev == 0 && curr == 0 && next == 0) {
                flowerbed[i] = 1;
                f--;
            }

            if (f <= 0)
                return true;

        }

        return f <= 0;


    }
}