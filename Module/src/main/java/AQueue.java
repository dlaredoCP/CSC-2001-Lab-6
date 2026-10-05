public record AQueue (String[] strArr) {

    /** Accepts a size and returns an empty queue of that size */
    public static AQueue empty_queue(int size){
        return new AQueue(new String[size]);
    }

    /** Accepts a string and adds it to the end of the queue */
    public void enqueue(String str){

    }

}
