package codechallenges.LinkedLists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    @Before public void makeList() {
        LinkedList checkIt = new LinkedList();
        checkIt.insert(3);

        Assert.assertEquals(3, checkIt.head);
    }

    @Test public void testInsertValue() {
        LinkedList checkIt = new LinkedList();

        Assert.assertEquals(null, checkIt.head);
    }

    @Test
    public void includes() {
    }

    @Test
    public void testToString() {
    }
}