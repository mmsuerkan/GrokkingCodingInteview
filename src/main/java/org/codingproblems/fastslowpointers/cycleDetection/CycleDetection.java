package org.codingproblems.fastslowpointers.cycleDetection;

public class CycleDetection {

    public static boolean detectCycle(Node head) {

        if(head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;


        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;

        }

        return false;
    }
}
