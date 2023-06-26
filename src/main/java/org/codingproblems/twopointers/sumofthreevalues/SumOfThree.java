package org.codingproblems.twopointers.sumofthreevalues;

import java.util.Arrays;

public class SumOfThree {

    public static boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int first = nums[i];

            int left = 0;
            int right = nums.length-1;

            while(left < right){
                if(first + nums[left] + nums[right] == target && left != i && right != i){
                    return true;
                } else if(first + nums[left] + nums[right] > target){
                    right--;
                }else{
                    left++;
                }
            }
        }

       return false;
    }
}
