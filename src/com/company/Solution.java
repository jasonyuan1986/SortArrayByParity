package com.company;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int writePointer = 0;
        int odd[] = new int[nums.length];
        int oddIndex = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] % 2 == 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            } else {
                odd[oddIndex] = nums[readPointer];
                oddIndex++;
            }
        }
        oddIndex = 0;
        for (; writePointer < nums.length; writePointer++) {
            nums[writePointer] = odd[oddIndex];
            oddIndex++;
        }
        return nums;
    }
}
