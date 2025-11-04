package org.solutions.p219ContainsDuplicate;

public class SolutionNSquareComplicity {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int k1 = 3;

        int[] nums2 = {1,2,3,1,2,3};
        int k2 = 2;

        int[] nums3 = {99, 99};
        int k3 = 2;

        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int k4 = 3;

        System.out.println(containsNearbyDuplicate(nums4, k4));
//        System.out.println(containsNearbyDuplicate(nums2, k2));
        System.out.println(containsNearbyDuplicate(nums3, k3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        if (nums.length <= k)
//            return false;

        for (int i = 0; i < nums.length; i++) {
            if (i + k >= nums.length) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[i] == nums[j])
                        return true;
                }
            } else {
                for (int j = i + k; j > i; j--) {
                    if (nums[i] == nums[j])
                        return true;
                }
            }
        }
        return false;
    }
}
