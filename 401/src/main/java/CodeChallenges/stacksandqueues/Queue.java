package codechallenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> front;
    Private Node<T> rear;

    public void enqueue(T value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode
    }
    
}
