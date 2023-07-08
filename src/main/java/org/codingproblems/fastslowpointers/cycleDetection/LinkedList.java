package org.codingproblems.fastslowpointers.cycleDetection;

// Template for the linked list
class LinkedList<T> {
    public Node head;
    // constructor will be used to make a LinkedList type object
    public LinkedList() {
        this.head = null;
    }
    // insertNodeAtHead method will insert a LinkedListNode at head
    // of a linked list.
    public void insertNodeAtHead(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }
    // createLinkedList method will create the linked list using the
    // given integer array with the help of InsertAthead method.
    public void createLinkedList(int[] lst) {
        for (int i = lst.length - 1; i >= 0; i--) {
           Node newNode = new Node(lst[i]);
            insertNodeAtHead(newNode);
        }
    }

    public void size(){
       Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }


}
