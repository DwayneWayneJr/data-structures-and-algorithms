package codechallenges.LinkedLists;

public class LinkedList {
  linked-list
    // head of list
    Node head;

    // Node class
    public static class Node {
        String data;
        Node next;

//   Constructor to create a new node
        Node(String data){
            next = null;
        }
    }

//   Inserts a new Node at front of the list.
    public void insertNew(String new_data) {
        Node new_node = new Node(new_data);
        if (this.head == null) {
            this.head = new_node;
        } else {
            head.next = new_node;
        }
    }

    public boolean includesValue(String data) {
        Node current_node = this.head;
        while  (current_node != null) {

            if (current_node.data == data) {
                return true;
            }
            current_node = current_node.next;
        }
        return false;
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
master
}
