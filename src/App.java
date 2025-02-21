public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack ar = new ArrayStack(6);
        ar.push(1);
        ar.push(2);
        System.out.println(ar.pop());
        System.out.println(ar.peek());

        //----------------------------------------
        //----------------------------------------
System.out.println();
        LinkedList_Stack ls = new LinkedList_Stack();
        ls.push(1);
        ls.push(2);
        System.out.println(ls.pop());
        System.out.println(ar.peek());

    }
}
