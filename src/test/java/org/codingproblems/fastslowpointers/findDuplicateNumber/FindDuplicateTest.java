package org.codingproblems.fastslowpointers.findDuplicateNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateTest {

    @Test
    void findDuplicate() {
        int[] nums = {1,3,4,2,2};
        int expected = 2;
        int actual = FindDuplicate.findDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    void findDuplicate2() {
        int[] nums = {3,1,3,4,2};
        int expected = 3;
        int actual = FindDuplicate.findDuplicate(nums);
        assertEquals(expected, actual);

    }

    @Test
    void findDuplicate3() {
        int[] nums = {3,1,5,4,2,6,7};
        int expected = 6;
        int actual = FindDuplicate.findDuplicate(nums);
        assertEquals(expected, actual);

    }
}