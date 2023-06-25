package org.codingproblems.twopointers.validpalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPalindrome() {
        Assertions.assertEquals(true,Main.isPalindrome("KAYAK"));
    }
}