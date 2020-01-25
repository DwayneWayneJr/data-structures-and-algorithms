package codechallenges.stacksandqueues;

public class Stack<E> {
    Node<E> top;

    public Stack() {
        this.top = null;
    }

    public void push(E eValue) {
        Node<E> newNode = new Node<E>(); // Create new node to hold value
        newNode.value = eValue; // set value in new node
        if (this.top == null) { // if no current nodes on stack
            this.top = newNode; // make this new node the first one
        } else {                // if there are nodes on the stack
            newNode.next = top; // point new node's next to the top of the stack
            this.top = newNode; // make new node the new top of the stack
        }
    }

    public E pop() {
        if (this.isEmpty()) { //checks if isEmpty to avoid NullPointerException
            return null;
        }
        E value = this.top.value ;  //save the value
        this.top = this.top.next; // set the top as the next in stack
        return value; //return the value
    }

    public E peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.top.value; //only return the VALUE of top
    }

    public boolean isEmpty() {
       return this.top == null; //one liner because true false is implied with boolean
    }
}