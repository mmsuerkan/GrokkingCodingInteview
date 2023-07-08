package org.codingproblems.fastslowpointers.cycleDetection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycleDetectionTest {

    @Test
    void detectCycle() {

        LinkedList linkedList = new LinkedList();
        linkedList.insertNodeAtHead(new Node(1));
        linkedList.insertNodeAtHead(new Node(2));
        linkedList.insertNodeAtHead(new Node(3));
        linkedList.insertNodeAtHead(new Node(4));
        linkedList.head.next.next.next.next = linkedList.head.next;
        assertTrue(CycleDetection.detectCycle(linkedList.head));
    }

    @Test
    void detectCycle2() {

        LinkedList linkedList = new LinkedList();
        linkedList.insertNodeAtHead(new Node(1));
        linkedList.insertNodeAtHead(new Node(2));
        linkedList.insertNodeAtHead(new Node(3));
        linkedList.insertNodeAtHead(new Node(4));

        assertFalse(CycleDetection.detectCycle(linkedList.head));
    }

}