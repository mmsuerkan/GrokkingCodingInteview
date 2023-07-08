package org.codingproblems.fastslowpointers.happyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappyNumber(23));
        assertFalse(happyNumber.isHappyNumber(12));
    }
}