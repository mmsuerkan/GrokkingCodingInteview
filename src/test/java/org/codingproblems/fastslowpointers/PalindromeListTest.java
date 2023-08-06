package org.codingproblems.fastslowpointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeListTest {

    @Test
    void palindrome() {

        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);

        boolean result = PalindromeList.palindrome(head);

        assertTrue(result);
    }
}