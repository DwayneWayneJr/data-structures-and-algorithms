package codechallenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public void enqueue(T value) {
        Node<T> newNode = new Node<T>(value);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public T dequeue() {
        if (front == null) {
            throw new NoSuchElementException("Cannot dequeue from empty queue."); //the same as checking isEmpty
        }

        Node<T> temp = front; //Take the front value and save it
        front = front.next;// move the fronts value to the next in queue
        return (T) temp.value; //return the value that was at front
    }

    public T peek() {
        if (front == null) {
            throw new NoSuchElementException("Cannot peek at an empty queue.");
        }
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
