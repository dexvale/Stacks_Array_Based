public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack ar = new ArrayStack(6);
        ar.push(1);
        ar.push(2);
        System.out.println(ar.pop());
        System.out.println(ar.peek());
        
    }
}
