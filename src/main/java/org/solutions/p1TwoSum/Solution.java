package org.solutions.p1TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(nums1);
        System.out.println(twoSum(nums1, target1));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target)
                continue;
            if (map.containsKey(nums[i])){
                return new int[]{i, map.get(nums[i])};
            } else {
                map.put(target-nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
