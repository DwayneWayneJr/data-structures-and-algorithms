package codechallenges.stacksandqueuesTest;

import codechallenges.stacksandqueues.Queue;
import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;

public class QueueTest {

    Queue emptyQueue;
    Queue queue;

    Queue<Integer> numbersQueue;
    Queue<String> stringQueue;

    @Before
    public void setUp() {
        queue = new Queue();
    }

    @Test
    public void testInstantiation() {
        Queue newQueue = new Queue();
        System.out.println("newQueue = " + newQueue);
    }

    @Test
    public void testEnqueueEmpty() {
        queue.enqueue(100);
        assertEquals(100, queue.peek());
    }

    @Test
    public void testEnqueueLoaded() {
        queue.enqueue(75);
        assertEquals(75, queue.peek());
        queue.enqueue(80);
        assertEquals(75, queue.peek());
        assertEquals(75, queue.dequeue());
        assertEquals(80, queue.peek());
    }

    @Test (expected = NoSuchElementException.class)
    public void testDequeueEmpty() {
        int value = queue.dequeue();
    }

    @Test public void testDequeueOnLoaded() {
        queue.enqueue(29);
        int value = queue.dequeue();
        assertEquals(19, value);
        queue.enqueue(30);
        queue.enqueue(35);
        value = queue.dequeue();
        assertEquals(30, value);
    }

    @Test (expected = NoSuchElementException.class)
    public void testPeekEmpty() {
        int value = queue.peek();
    }

    @Test
    public void testPeekLoaded() {
        queue.enqueue(4);
        queue.enqueue(9);
        int value = queue.peek();
        assertEquals(4, value);
        value = queue.peek();
        assertEquals(4, value);
    }

    @Test
    public void test EmptyOnEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEmptyOnLoaded() {
        queue.enqueue(4);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
