package codechallenges.stacksandqueuesTest;

import codechallenges.stacksandqueues.Stack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> stack; //create a stack to test


    @Before
    public void setStack() {
        stack = new Stack<Integer>();
    }

    @Test
    public void testPushToStack() {
        stack.push(5);
        assertEquals(10, (int) stack.peek());
    }

    @Test
    public void testPushMultiple() {
        stack.push(60);
        stack.push(65);
        assertEquals(65, (int) stack.pop());
        assertEquals(60, (int) stack.peek());
    }

    @Test
    public void testPop() {
        stack.push(20);
        assertEquals(20, (int) stack.pop());
    }

    @Test
    public void testPopMultiple() {
        stack.push(25);
        stack.push(30);
        assertFalse(stack.isEmpty());
        assertEquals(30, (int) stack.pop());
        assertEquals(25, (int) stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        stack.push(2);
        assertEquals(2, (int) stack.peek());
    }
}