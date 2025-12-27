package org.solutions.p121BestTimeBuyNSell1;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {1, 2, 4};
        int[] prices3 = {4,7,11,1,2};
        System.out.println(maxProfit(prices3));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;


        int tmpMax = 0;
        int bestMax = 0;
        int i = 0;
        int j = 1;
        while (i < prices.length - 1 && j < prices.length) {

            if (prices[j] > prices[i]){
                tmpMax = prices[j] - prices[i];
            }

            if (bestMax < tmpMax) {
                bestMax = tmpMax;
            }
            if (j < prices.length - 1) {
                j++;
                continue;
            }

            if (j == prices.length - 1) {
                i++;
                j = i+1;
            }
        }
        return bestMax;
    }
}
