package ds.stack1;

public class Queue {
    private int maxSize; // iniitializes the set number of slots
    private long[] queArray; // slots to maintain the data
    private int front; // front element index
    private int rear; // back element index
    private int nItems; // counter for items in queue
    
    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; // index of first element of array
        rear = -1; // indicates nothing is considered last item
        nItems = 0; // no elements in array yet
    }
    
    public void insert(long j){
        //if statement overwrites elements creating a CIRCULAR QUEUE BUT IS NOT NEEDED
        if(rear == maxSize -1){
            rear = -1;
        }
        rear++; //first element is also last element now since one item is inserted
        queArray[rear] = j;
        nItems++;
    }
    
    /*Remove element from front of Array*/
    public long remove(){
        long temp = queArray[front];
        front++;; // point to next item in line as new front
      
        if(front == maxSize){
            front = 0; // sets front back to zero index to utilized entire array again]
        }
        nItems--; // reduced number of items in array
        return temp; //item being removed
    }
    
    public long peekFront(){
        return queArray[front];
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
    
    /*View Contents of Array*/
    public void view(){
        System.out.print("[ ");
        for(int i=0;i<queArray.length;i++){
            System.out.print(queArray[i] + " ");
        }
        System.out.println(" ]");
    }
}
