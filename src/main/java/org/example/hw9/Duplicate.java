package org.example.hw9;

import java.util.HashSet;

public class Duplicate {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Example 1: " + checksDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Example 2: " + checksDuplicate(nums2));

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Example 3: " + checksDuplicate(nums3));
    }

    public static boolean checksDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
