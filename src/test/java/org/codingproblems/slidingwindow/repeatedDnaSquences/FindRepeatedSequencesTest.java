package org.codingproblems.slidingwindow.repeatedDnaSquences;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class FindRepeatedSequencesTest {




    @Test
    void testFindRepeatedSequences() {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        int k = 10;
        HashSet<Object> repeatedObjects = new HashSet<>(2);
        repeatedObjects.add("AAAAACCCCC");
        repeatedObjects.add("CCCCCAAAAA");
        assertEquals(repeatedObjects, FindRepeatedSequences.findRepeatedSequences(s, k));
    }
}