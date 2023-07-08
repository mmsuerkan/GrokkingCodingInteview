package org.codingproblems.fastslowpointers.middleofLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





class MiddleNodeTest {

    @Test
    void middleNode() {

        LinkedList list = new LinkedList();
        list.insertNodeAtEnd(1);
        list.insertNodeAtEnd(2);
        list.insertNodeAtEnd(3);
        list.insertNodeAtEnd(4);
        list.insertNodeAtEnd(5);
        Assertions.assertEquals(3, MiddleNode.middleNode(list.head).data);
    }

    @Test
    void middleNode2() {

        LinkedList list = new LinkedList();
        list.insertNodeAtEnd(1);
        list.insertNodeAtEnd(2);
        list.insertNodeAtEnd(3);
        list.insertNodeAtEnd(4);
        list.insertNodeAtEnd(5);
        list.insertNodeAtEnd(6);
        Assertions.assertEquals(4, MiddleNode.middleNode(list.head).data);
    }
}