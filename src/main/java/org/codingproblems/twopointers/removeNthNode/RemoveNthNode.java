package org.codingproblems.twopointers.removeNthNode;

public class RemoveNthNode {

    public static Node removeNthLastNode(Node head, int n) {

        Node slow = head,fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node temp = slow.next;

        slow.next = temp.next;

        return head;
    }



}
