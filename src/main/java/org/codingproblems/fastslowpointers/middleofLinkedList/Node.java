package org.codingproblems.fastslowpointers.middleofLinkedList;

class Node <T>{
    public T data;
    public Node<T> next;
    // Constructor will be used to make a LinkedListNode type object
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}