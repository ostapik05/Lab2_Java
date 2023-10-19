package task1;

public class Main {
    public static void main(String ... args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(5);
        stack.push(8);
        stack.push(12);

        for (int item : stack) {
            System.out.println(item);
        }

        System.out.println(stack.peek());//Top
        System.out.println(stack.pop());//Popped
        System.out.println(stack.size());

        for (int item : stack) {
            System.out.println(item);
        }
    }
}