import mypkg.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<String>();
        stack.push("hello world");
        System.out.println(stack.peek());
    }
}
