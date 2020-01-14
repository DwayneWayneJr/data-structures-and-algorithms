package codechallenges.LinkedLists;

public class LinkedList {
    Node head;

    public static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            head.next = newNode;
        }
    }

    public void includes(int value) {
        Node head = this.head;
        while  (head != null) {
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

