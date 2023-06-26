package org.codingproblems.twopointers.sumofthreevalues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfThreeTest {

    @Test
    void findSumOfThree() {


        int[] nums = {3,7,1,2,8,4,5};
        int target = 10;
        boolean expected = true;
        boolean actual = SumOfThree.findSumOfThree(nums, target);
        assertEquals(expected, actual);

        int[] nums2 = {3,7,1,2,8,4,5};
        int target2 = 20;
        boolean expected2 = true;
        boolean actual2 = SumOfThree.findSumOfThree(nums2, target2);
        assertEquals(expected2, actual2);

        int[] nums3 = {3,7,1,2,8,4,5};
        int target3 = 21;
        boolean expected3 = true;
        boolean actual3 = SumOfThree.findSumOfThree(nums3, target3);
        assertEquals(expected3, actual3);





    }
}