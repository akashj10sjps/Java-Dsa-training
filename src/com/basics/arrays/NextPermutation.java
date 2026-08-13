package com.basics.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void nextpermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        };
    }
    public static void main(String[] args) {
        NextPermutation tc=new NextPermutation();
        int[] nums={3,2,1};
        tc.nextpermutation(nums);
        System.out.println("Next Permutation: "+ Arrays.toString(nums));
    }
}
