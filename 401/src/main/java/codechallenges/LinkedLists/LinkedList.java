package codechallenges.LinkedLists;

public class LinkedList {
    // head of list
    Node head;


//   Inserts a new Node at front of the list.
    public void linkedListIn (String letter) {
        Node newNode = new Node(letter);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
        }
    }

    public boolean linkedListIncludes(String data) {
        Node currentNodePosition = this.head;

        while  (currentNodePosition.next != null) {

            if (currentNodePosition.data == data) {
                return true;
            }
            currentNodePosition = currentNodePosition.next;
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

}
