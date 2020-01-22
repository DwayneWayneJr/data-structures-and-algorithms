package codechallenges.stacksandqueuesTest;

import codechallenges.stacksandqueues.Queue;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class QueueTest {

    @Test
    public void testInstantiation() {
        Queue newQueue = new Queue();
        System.out.println("newQueue = " + newQueue);
    }

    Queue queue = new Queue();

    @Test
    public void testEnqueueEmpty() {
        queue.enqueue(314);
    }

    @Test
    public void testEnqueueLoaded() {
        queue.enqueue(200);
        queue.enqueue(201);
    }

    @Test (expected = Exception.class)
    public void testDequeueEmpty() {
        int value = queue.dequeue();
        System.out.println("value = " + value);
        queue.enqueue(20);
        queue.enqueue(25);
        value = queue.dequeue();
        System.out.println("value = " + value);
    }

    @Test (expected = Exception.class)
    public void testPeekEmpty() {
        int value = queue.peek();
        System.out.println("value = " + value);
    }

    @Test
    public void testPeekLoaded() {
        queue.enqueue(5);
        queue.enqueue(10);
        int value = queue.peek();
        System.out.println("value = " + value);
    }

    @Test
    public void test EmptyOnEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEmptyOnLoaded() {
        queue.enqueue(4);
        assertFalse(queue.isEmpty());
    }
}
