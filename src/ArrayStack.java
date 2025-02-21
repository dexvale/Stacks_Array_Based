public class ArrayStack {
    int[] stack;
    int top;
    int capacity;

    public ArrayStack(int capacity) {
        stack = new int[capacity];
        top = -1;
        this.capacity = capacity;
    }

void push(int value){
if(top == capacity - 1){
throw new StackOverflowError("Stack is full");
}
stack[++top] = value;
}

int pop(){
    if(isEmpty()){

    }
}

boolean isEmpty(){
    return top == -1;
}
}
