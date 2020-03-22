package ds.stack1;

/**
 *
 * @author Robert Beckham
 */
public class Stack {
    private int maxSize; //stores size of stack
    private char[] stackArray; //container for list of items of type long
    private int top; //index position of last item placed on stack
    
    
    public Stack(int size){
        this.maxSize = size;
        this.stackArray  =new char[maxSize]; //initialize array with this size
        this.top = -1; //so item 1 is placed at position 0 of array
    }
    
    //add to top of stack
    public void push(char j){
        if(isFull()){
            System.out.println(" this stack is already full");
        } else{
            top++;
            stackArray[top] = j;
        }
    }
    
    //remove from top
    public char pop(){
        
        if(isEmpty()){
            System.out.println(" this stack is already empty");
            return '0';
        } else{
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
        
    }
    
    //view top item
    public char peek(){
        return stackArray[top];
    }
    
    //check if stack is empty
    public boolean isEmpty(){
        return(top == -1);
    }
    
    //check if is full by seeing if the index of last added item is same index as last position in array
    public boolean isFull(){
        return(maxSize-1 == top);
    }
    
    
    
    
    
} //end class
