import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LQueueTest {

    @Test
    void empty_queue(){
        Node thing1 = new Node("a", new Node("b", new Node("c", null)));
        Node thing2 = new Node("d", new Node("e", new Node("f", null)));
        LQueue ex = new LQueue(thing1, thing2);

        assertNotEquals(ex, LQueue.empty_queue());
    }

    @Test
    void enqueue(){
        LQueue ex = LQueue.empty_queue();
        ex.enqueue("a");
        assertEquals(1, ex.size());
    }

    @Test
    void dequeue(){

    }

    @Test
    void size(){
        Node thing1 = new Node("a", null);
        Node thing2 = new Node("b", new Node("c", new Node("d", null)));
        LQueue ex = new LQueue(thing1, thing2);
        assertEquals(4, ex.size());
    }

    @Test
    void is_empty(){
        assertTrue(LQueue.empty_queue().is_empty());
    }

}