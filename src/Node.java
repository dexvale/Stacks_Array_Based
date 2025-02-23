public class Node {
    int data;
    Node next;
                // 1
    public Node(int d){
        this.data = d;
        next = null;
    }

}

class LinkedList_Stack{
    //top -> null
    Node top;

    //Adds value on top and increases top
            //  v = 1
    void push(int value){
                                //1
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;

    }
    boolean isEmpty(){
        return top == null;
    }
    //Removes the top value and decreases top.
    int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is emptry");
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    int peek(){
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }





}
