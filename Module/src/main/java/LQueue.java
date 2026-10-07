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
        if (front == null){
            front = new Node(str, null);
        } else {
            end = new Node(str, end);
        }
    }

    /** Removes and returns the element at the front of the queue */
    public String dequeue(String str){
        return null;
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
        return front == null && end == null;
    }

}
