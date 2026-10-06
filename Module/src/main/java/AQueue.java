public class AQueue {

    private String[] queue;
    private int count;
    private int head;
    private int tail;
    private int capacity;

    public AQueue(int Capacity){
        count = 0;
        capacity = Capacity;
        queue = new String[Capacity];
        head = 0;
        tail = 0;
    }

    /** Accepts a size and returns an empty queue of that size */
    public static AQueue empty_queue(int len){
        return new AQueue(len);
    }

    /** Accepts a string and adds it to the end of the queue */
    public void enqueue(String str){
        if (is_empty()){
            queue[0] = str;
            count++;
        } else
        if (tail+1==queue.length){

        } else{
            queue[count] = str;
            count++;
            tail = count+head-1;
        }
    }

    /** Removes and returns the element at the front of the queue */
    public String dequeue(){
        if (is_empty()){
            throw new IndexOutOfBoundsException();
        } else {
            String front = queue[head];
            queue[head] = null;
            count--;
            head++;
            return front;
        }
    }

    /** Returns the element at the front of the queue, without removing it */
    public String peek(){
        if (is_empty()){
            throw new IndexOutOfBoundsException();
        } else {
            return queue[head];
        }
    }



    /** Returns a count of the number of elements currently in the queue */
    public int size(){
        return count;
    }

    /** Returns true when the queue contains no elements */
    public boolean is_empty(){
        return count == 0;
    }

}
