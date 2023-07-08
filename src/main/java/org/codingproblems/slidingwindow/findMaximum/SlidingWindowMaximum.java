package org.codingproblems.slidingwindow.findMaximum;

public class SlidingWindowMaximum {

    private static int length;

    public static int[] findMaxSlidingWindow(int[] nums, int w) {

        length = nums.length;
        int [] output = new int[w];
        for(int i = 0; i< length - w +1;i++){
            int max = findMax(nums,i,w);
            output[i] = max;
        }
        return output;
    }

    static int findMax(int[] nums, int i, int window) {

        int max = nums[0];

        for (int j = i; j < i+window; j++) {
            if(nums[j] > max){
                max = nums[j];
            }
        }

        return max;
    }
}
