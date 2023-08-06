package org.codingproblems.fastslowpointers;

public class PalindromeList{

    static Node reverseLinkedList(Node slowPtr){
        Node prev = null;
        Node next = null;
        Node curr = slowPtr;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static boolean palindrome(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        Node reverseNode = reverseLinkedList(slow);
        boolean check = compareTwoHalves(head, reverseNode);
        reverseLinkedList(reverseNode);

        return check;
    }

    private static boolean compareTwoHalves(Node firstHalf, Node secondHalf) {
        while (firstHalf != null && secondHalf != null){
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}
