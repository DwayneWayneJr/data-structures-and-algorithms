package codechallenges.LinkedLists;

public class LinkedList {
    // head of list
    Node head;

    // Node class
    public static class Node {
        int data;
        Node next;

//   Constructor to create a new node
        Node(int d){
            data = d;
            next = null;
        }
    }

//   Inserts a new Node at front of the list.
    public void insertNew(int new_data) {
        Node new_node = new Node(new_data);
        if (this.head == null) {
            this.head = new_node;
        } else {
            head.next = new_node;
        }
    }

    public boolean includesValue(int data) {
        Node current_Node = this.head;
        while  (current_ != null) {
            if (head.data == value) {
                return;
            }
            head = head.next;
        }
    }

    public String toString() {
        Node head = this.head;
        StringBuilder linkedListOut = new StringBuilder();
        String linkedList;
        while (head != null) {
            linkedListOut.append("{").append(head.data).append("} ->");
            head = head.next;
        }
        return linkedListOut.toString();
    }
}

