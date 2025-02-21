public class ArrayStack {
    int[] stack;
    int top;
    int capacity;
                    //capacity = 6
    public ArrayStack(int capacity) {
                        //6
        stack = new int[capacity];
        top = -1;
        this.capacity = capacity;
    }
    //Adds value on top and increases top
                //1
    void push(int value) {
            //-1     c=6
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full");
        }
        //-1+1 = 0     v = 1
        stack[++top] = value;
    }


    boolean isEmpty() {
        return top == -1;
    }
//Removes the top value and decreases top.
    int pop(){
        if(isEmpty()){
            throw new IllegalStateException ("Stack is empty");
        }
        return stack[top--];
    }
//Returns the top value without removing it.
    int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }


}


