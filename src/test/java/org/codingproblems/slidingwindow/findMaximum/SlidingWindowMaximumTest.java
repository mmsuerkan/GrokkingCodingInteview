package org.codingproblems.slidingwindow.findMaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {

    @Test
    void findMaxSlidingWindow() {
        int[] nums = {-4, 2, -5, 3, 6};
        int w = 3;
        int[] expected = {2, 3, 6};
        int[] actual = SlidingWindowMaximum.findMaxSlidingWindow(nums, w);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findMax(){
        int[] nums = {-4, 2, -5, 3, 6};
        int i = 0;
        int window = 3;
        int expected = 2;
        int actual = SlidingWindowMaximum.findMax(nums, i, window);
        assertEquals(expected, actual);
    }
}