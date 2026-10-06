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
    void enqueue2(){
        AQueue ex = AQueue.empty_queue(2);
        ex.enqueue("a");
        ex.enqueue("b");
        ex.enqueue("c");
        assertEquals(3, ex.size());
    }

    @Test
    void dequeue(){
        AQueue ex = AQueue.empty_queue(4);
        ex.enqueue("a");
        ex.enqueue("b");
        ex.enqueue("c");
        ex.dequeue();
        IO.println();
        assertEquals(2, ex.size());
    }

    @Test
    void peek(){
        AQueue ex = AQueue.empty_queue(4);
        ex.enqueue("a");
        ex.enqueue("b");
        ex.enqueue("c");
        assertEquals("a", ex.peek());
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