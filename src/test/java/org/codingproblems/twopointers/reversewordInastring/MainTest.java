package org.codingproblems.twopointers.reversewordInastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void reverseWords() {

        assertEquals("blue is sky the", Main.reverseWords("the sky is blue"));
        assertEquals("world! hello", Main.reverseWords("hello world!"));
        assertEquals("example good a", Main.reverseWords("a good example"));
        assertEquals("Alice Loves Bob", Main.reverseWords("Bob Loves Alice"));
        assertEquals("bob like even not does Alice", Main.reverseWords("Alice does not even like bob"));

    }
}