package codechallenges.stacksandqueuesTest;

import codechallenges.stacksandqueues.Queue;
import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;

public class QueueTest {

    Queue<Integer> queue; // the queue I am testing


    @Before
    public void setUp() {
        queue = new Queue<Integer>(); // instantiating a new queue
    }

    @Test
    public void testInstantiation() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(100);
        assertEquals(100, (int) queue.peek());
    }

    @Test
    public void testDequeue() {
        queue.enqueue(100);
     assertEquals(100, (int) queue.dequeue());
    }

    @Test
    public void testPeek() {
        queue.enqueue(10);
        assertEquals(10, (int) queue.peek());
    }

    @Test
    public void testEmptyOnEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(15);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
