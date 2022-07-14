package Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        for(String item: stack){
            System.out.println(item);
        }
        System.out.println("----------------------------------");
        String res = stack.pop();
        System.out.println(res);
        System.out.println(stack.size());


    }
}
