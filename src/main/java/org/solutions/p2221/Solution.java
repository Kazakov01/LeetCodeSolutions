package org.solutions.p2221;

class Solution {
    public int triangularSum(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        if (nums.length == 0)
            return 0;

        int[] newNums = new int[nums.length-1];
        for (int i = 0; i < nums.length - 1; i++) {
            newNums[i] = (nums[i] + nums[i+1])%10;
        }
        return triangularSum(newNums);
    }
}