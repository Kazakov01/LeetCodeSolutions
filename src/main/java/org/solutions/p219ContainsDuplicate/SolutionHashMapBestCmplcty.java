package org.solutions.p219ContainsDuplicate;

import java.util.HashMap;

public class SolutionHashMapBestCmplcty {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int k1 = 3;

        int[] nums2 = {1,2,3,1,2,3};
        int k2 = 2;

        int[] nums3 = {99, 99};
        int k3 = 2;

        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int k4 = 3;

        int[] nums5 = {1,0,1,1};
        int k5 = 1;

        System.out.println(containsNearbyDuplicate(nums4, k4));
//        System.out.println(containsNearbyDuplicate(nums2, k2));
        System.out.println(containsNearbyDuplicate(nums3, k3));
        System.out.println(containsNearbyDuplicate(nums5, k5));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], i);
            } else {
                if (hashMap.containsKey(nums[i])) {
                    if (Math.abs(hashMap.get(nums[i]) - i) <= k) {
                        return true;
                    } else {
                        hashMap.replace(nums[i], i);
                    }
                }
            }
        }
        return false;
    }
}
