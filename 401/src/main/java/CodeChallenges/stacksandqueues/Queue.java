package codechallenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node front;
    private Node rear;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            throw new NoSuchElementException("Cannot dequeue from empty queue.");
        }

        Node temp = front;
        front = front.next;
        return (int) temp.value;
    }

    public int peek() {
        if (front == null) {
            throw new NoSuchElementException("Cannot peek at an empty queue.");
        }
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
