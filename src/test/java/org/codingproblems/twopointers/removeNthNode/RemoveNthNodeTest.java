package org.codingproblems.twopointers.removeNthNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeTest {

    @Test
    void removeNthLastNode() {

        LinkedList list = new LinkedList();
        list.createLinkedList(new int[]{1,2,3,4,5,6,7,8,9,10});
        list.size();
        Node head = list.head;
        Node result = RemoveNthNode.removeNthLastNode(head, 4);
        list.head = result;
        list.size();
        assertEquals(8, list.head.next.next.next.next.next.next.data);


    }
}