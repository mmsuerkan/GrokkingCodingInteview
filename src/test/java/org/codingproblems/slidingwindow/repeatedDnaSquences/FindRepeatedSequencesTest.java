package org.codingproblems.slidingwindow.repeatedDnaSquences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindRepeatedSequencesTest {

    @Test
    void findRepeatedSequences() {

        String s = "AGCTGAAAGCTTAGCTG";
        int k = 5;
        assertEquals(1, FindRepeatedSequences.findRepeatedSequences(s, k).size());
    }

    @Test
    void findRepeatedSequences2() {

        String s = "AAAAAAAAAAAAA";
        int k = 10;
        assertEquals(1, FindRepeatedSequences.findRepeatedSequences(s, k).size());
    }


}