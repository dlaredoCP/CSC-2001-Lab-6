public class LQueue {
    private Node front;
    private Node end;

    public LQueue(Node Front, Node End){
        front = Front;
        end = End;
    }

    /** Returns an empty queue */
    public static LQueue empty_queue(){
        return new LQueue(null, null);
    }

    /** Accepts a string and adds it to the end of the queue */
    public void enqueue(String str){
        if (is_empty()){
            front = new Node(str, null);
        } else {

            end = new Node(str, end);
        }
    }

    /** Removes and returns the element at the front of the queue */
    public String dequeue(){
        if (is_empty()){
            throw new IndexOutOfBoundsException("Unable to dequeue because the array is empty!");
        } else {
            String top = front.value();
            String newTop;
            if (end == null){
                front = null;
            } else {
                front = new Node(end.value(), null);
                end = reversedEnd();
                end = new Node(end.rest().value(), end.rest().rest());
                end = reversedEnd();
            }
            return top;
        }
    }

    /** Returns the element at the front of the queue */
    public String peek(){
        if (is_empty()){
            throw new IndexOutOfBoundsException();
        } else {
            return front.value();
        }
    }

    /** Returns a count of the number of elements currently in the queue */
    public int size(){
        if (is_empty()){
            return 0;
        } else {
            int count = 1;
            for (Node cur = end; cur != null; cur = cur.rest()){
                count++;
            }
            return count;
        }
    }

    /** Returns true when the queue contains no elements */
    public boolean is_empty(){
        return front == null;
    }

    /** Reverses the end of the LQueue */
    public Node reversedEnd(){
        Node newEnd = null;
        for (Node cur = end; cur!=null; cur=cur.rest()){
            newEnd = new Node(cur.value(), newEnd);
        }
        return newEnd;
    }

}
