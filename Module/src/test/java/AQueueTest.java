import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AQueueTest {

    @Test
    void empty_queue(){
        assertNotEquals(null, AQueue.empty_queue(3));
    }

    @Test
    void enqueue1(){
        AQueue ex = AQueue.empty_queue(4);
        ex.enqueue("a");
        ex.enqueue("b");
        ex.enqueue("c");
        assertEquals(3, ex.size());
    }

    @Test
    void dequeue1(){
        AQueue ex = AQueue.empty_queue(4);
        ex.enqueue("a");
        ex.enqueue("b");
        ex.enqueue("c");
        ex.dequeue();
        IO.println();
        assertEquals(2, ex.size());
    }

    @Test
    void dequeue2(){
        AQueue ex = AQueue.empty_queue(3);
        ex.enqueue("a");
        ex.enqueue("b");
        ex.enqueue("c");
        ex.dequeue();
        ex.dequeue();
        ex.enqueue("d");
        IO.println();

        assertEquals("c", ex.peek());
    }

    @Test
    void peek(){
        AQueue ex = AQueue.empty_queue(4);
        ex.enqueue("a");
        ex.enqueue("b");
        ex.enqueue("c");
        ex.dequeue();
        ex.enqueue("e");
        assertEquals("b", ex.peek());
    }

    @Test
    void size(){
        AQueue ex = AQueue.empty_queue(4);
        assertEquals(0, ex.size());
    }

    @Test
    void is_empty(){
        AQueue ex = AQueue.empty_queue(4);
        assertTrue(ex.is_empty());
    }

}